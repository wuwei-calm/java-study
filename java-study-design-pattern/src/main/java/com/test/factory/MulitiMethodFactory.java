package com.test.factory;

/**
 * @author czg
 * 工厂多个方法返回一个接口的不同实现类的对应实例
 * 多个方法工厂
 * @date 2019/3/9
 */
public class MulitiMethodFactory {
    public Apple getApple(){
        return new Apple();
    }
    public Orange getOrange(){
        return new Orange();
    }

    public static void main(String args[]){

        Apple apple = new MulitiMethodFactory().getApple();
        apple.say();
    }
}
