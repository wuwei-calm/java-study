package com.test.proxy;

/**
 * @author czg
 * @date 2019/2/28
 */
public class RealWork implements CommonInterface {
    @Override
    public void doSomethine() {
        System.out.println("真实主题要做的任务！");
    }
}
