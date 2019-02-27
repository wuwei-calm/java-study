package com.test.proxy;

/**
 * @author czg
 * @date 2019/2/28
 */
public class ProxyWork implements CommonInterface {
    private RealWork realWork;

    @Override
    public void doSomethine() {
        System.out.println("代理主题开始做任务！");
        realWork = new RealWork();
        System.out.println("代理主题任务结束！");
        realWork.doSomethine();
    }
}
