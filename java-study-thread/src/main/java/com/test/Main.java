package com.test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author czg
 * @date 2019/6/8
 * 运行程序得到的线程数量是下面的输出
 * [6]:Monitor Ctrl-Break
 * [5]:Attach Listener
 * [4]:Signal Dispatcher//分发处理发送给JVM信号的线程
 * [3]:Finalizer//调用对象finalize方法的线程
 * [2]:Reference Handler//清除Reference的线程
 * [1]:main   //主线程
 *
 * 一个java程序从main（）方法开始执行，然后按照既定的代码逻辑执行，看似没有其他线程参与，但是
 * 实际上java程序天生就是多线程程序，因为main方法是一个名称为main的线程，
 */
public class Main {
    public static void main(String args[]){
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
        for(ThreadInfo info:threadInfos){
            System.out.println("["+info.getThreadId()+"]"+":"+info.getThreadName());
        }
    }
}
