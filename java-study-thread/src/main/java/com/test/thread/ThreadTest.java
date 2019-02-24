package com.test.thread;

/**
 * @author czg
 * @date 2019/2/24
 */
public class ThreadTest extends Thread{

    /**
     * 如果此线程是使用单独的Runnable 运行对象构造的，然后调用Runnable对象的run方法;
     * 否则，此方法不执行任何操作并返回。
     *
     * Thread的子类应覆盖此方法。
     *
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " hello thread");
    }

    public static void main(String args[])throws  Exception{

        ThreadTest t = new ThreadTest();
        ThreadTest t2 = new ThreadTest();
        t.start();t2.start();
        t.join();//t2.join();
        System.out.println(Thread.currentThread().getName());
    }
}
