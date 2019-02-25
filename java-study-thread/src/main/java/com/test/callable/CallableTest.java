package com.test.callable;

import java.util.UUID;
import java.util.concurrent.*;

/**
 * @author czg
 * @date 2019/2/24
 */
public class CallableTest implements Callable<String> {
    public CallableTest() {
        super();
    }

    /**
     * 计算结果, 如果无法执行此操作，则抛出异常.
     *
     * @return 计算结果
     * @throws Exception 如果无法计算结果
     */
    @Override
    public String call() throws Exception {
        return UUID.randomUUID().toString();

    }

    public static void main(String args[]) throws Exception{

        FutureTask<String> futureTask = new FutureTask<>(new CallableTest());
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(futureTask);
        if(!futureTask.isDone()){

            System.out.println(futureTask.get());
        }
    }
}
