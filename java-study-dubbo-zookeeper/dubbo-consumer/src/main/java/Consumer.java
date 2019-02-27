import com.test.api.DemoService;
import com.test.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println("HelloService "+ helloService.hello());
    }
}