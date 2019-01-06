package com.test.thread;

/**
 * @author czg
 * @date 2019/1/6
 */
public class SynchronizedTest extends Thread {
    private int count=5;

    /**
     * 不添加synchronized的run方法，执行的结果可能不是想要的结果，添加了synchronized关键字，相当于对代码添加了锁，
     * 五个线程要执行run方法中的代码，就必须要获得锁，否则就等待。
     */
    @Override
    public /*synchronized*/ void run() {
        count --;
        System.out.println("线程名称："+Thread.currentThread().getName()+",count的值："+count);
    }

    public static void main(String args[]){
        SynchronizedTest thread = new SynchronizedTest();
        Thread t1= new Thread(thread,"t1");
        Thread t2= new Thread(thread,"t2");
        Thread t3= new Thread(thread,"t3");
        Thread t4= new Thread(thread,"t4");
        Thread t5= new Thread(thread,"t5");
        t5.start();
        t4.start();
        t3.start();
        t2.start();
        t1.start();


    }
}
