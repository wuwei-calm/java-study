package com.test.echo;
 
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
 
public class HelloClient {
	public void connect(String host, int port) throws Exception {
		EventLoopGroup workerGroup = new NioEventLoopGroup();
 
		try {
			Bootstrap b = new Bootstrap();
			b.group(workerGroup);
			b.channel(NioSocketChannel.class);
			b.option(ChannelOption.SO_KEEPALIVE, true);
			b.handler(new ChannelInitializer<SocketChannel>() {
				@Override
				public void initChannel(SocketChannel ch) throws Exception {
					ch.pipeline().addLast(new HelloClientIntHandler());
				}
			});
 
			// Start the client.
			ChannelFuture f = b.connect(host, port).sync();
			Channel channel = f.channel();
			for(;;){
				System.out.println("===================");
				byte[] buffer = new byte[1024];
				int len = System.in.read(buffer);
				String object = new String(buffer,0,len);
				int total = object.getBytes().length + 4 +4;
				ByteBuf byteBuf = Unpooled.buffer(1024);
				byteBuf.writeInt(total);
				byteBuf.writeInt(2);
				byteBuf.writeBytes(object.getBytes());
				System.out.println("============="+object);
				channel.writeAndFlush(byteBuf);
			}
			// Wait until the connection is closed.
			//f.channel().closeFuture().sync();
		} finally {
			workerGroup.shutdownGracefully();
		}
 
	}
 
	public static void main(String[] args) throws Exception {
		HelloClient client = new HelloClient();
		client.connect("127.0.0.1", 8000);
	}
}
