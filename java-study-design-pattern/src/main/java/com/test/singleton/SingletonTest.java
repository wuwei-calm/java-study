package com.test.singleton;

/**
 * @author czg
 * 单例设计模式，构造方法私有化，内部初始化，提供一个静态方法以供调用
 * @date 2019/2/28
 */
public class SingletonTest {

    private SingletonTest(){};
    private static SingletonTest INSTANCE = new SingletonTest();
    public static SingletonTest getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }

        INSTANCE = new SingletonTest();
        return INSTANCE;
    }

    public static void main(String args[]){
        System.out.println(SingletonTest.getInstance());

    }
}
