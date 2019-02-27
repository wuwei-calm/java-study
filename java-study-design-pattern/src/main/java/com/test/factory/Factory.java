package com.test.factory;

/**
 * @author czg
 * @date 2019/2/28
 */
public class Factory {

    public static Fruit getFruit(String className)throws Exception{
        Fruit fruit = (Fruit) Class.forName(className).newInstance();
        return fruit;
    }

    public static void main(String args[]) throws  Exception{

        Fruit f = Factory.getFruit("com.test.factory.Apple");
        f.say();
    }
}
