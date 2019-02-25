package com.test.callable;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author czg
 * @date 2019/2/26
 */
public class FutureTaskTest {
    public static void main(String args[]){

        FutureTask<String> futureTask = new FutureTask<>(() -> UUID.randomUUID().toString());
        //不建议使用这种方式创建线程池
        //ExecutorService executorService = Executors.newFixedThreadPool(2);

        //第一种

        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(1,
                new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(true).build());

        executorService.submit(futureTask);

        if(!futureTask.isDone()){
            try {
                System.out.println(futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        //第二种

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

        //Common Thread Pool
        ExecutorService pool = new ThreadPoolExecutor(5, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        pool.execute(()-> System.out.println(Thread.currentThread().getName()));
        pool.shutdown();//gracefully shutdown

        //第三种
        //第二种  xml配置线程池

        /**

         <bean id="userThreadPool"
         class="org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor">
         <property name="corePoolSize" value="10" />
         <property name="maxPoolSize" value="100" />
         <property name="queueCapacity" value="2000" />

         <property name="threadFactory" value= threadFactory />
         <property name="rejectedExecutionHandler">
         <ref local="rejectedExecutionHandler" />
         </property>
         </bean>
         //in code
         userThreadPool.execute(thread);



         * */
    }
}
