package com.test.runnable;

/**
 * @author czg
 * @date 2019/2/24
 */
public class RunnableTest implements Runnable {
    /**
     * 当使用实现接口<code> Runnable </ code>的对象来创建线程时, 启动线程会导致在单独执行的线程中调用对象的<code> run </ code>方法。
     * <p>
     * 方法<code> run </ code>的一般合同是它可以采取任何行动。
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.println("线程名称:\t" + Thread.currentThread().getName() + "\n\r");
    }

    public static void main(String args[]){

        RunnableTest runnableTest = new RunnableTest();
        new Thread(runnableTest,"线程的名称").start();
        System.out.println(Thread.currentThread().getName());
    }
}
