package com.test.channel;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileInputStremByteBuffer {
    public static void main(String args[]) throws Exception {
        FileInputStream input = new FileInputStream("java-study-framework/java-study-netty/1.txt");
        FileChannel inputChannel = input.getChannel();
        FileOutputStream out = new FileOutputStream("java-study-framework/java-study-netty/2.txt");
        FileChannel outputChannel = out.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        while(true){
            buffer.clear();
            int len = inputChannel.read(buffer);
            if(len == -1){
                break;
            }
            buffer.flip();
            outputChannel.write(buffer);
        }
        inputChannel.close();
        outputChannel.close();
    }
}
