package com.test.prototype;

/**
 * @author czg
 * @date 2019/6/23
 */
public class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        Animal animal1 = new Animal();
        animal1.setAge(2);
        animal1.setName("狗");

        Animal anima2 = animal1.clone();
        anima2.setName("猫");
        System.out.println(anima2);
        System.out.println("==========animal1==========");
        System.out.println(animal1);
        //浅克隆
        anima2.getList().add("hello");
        anima2.getList().add("world");
        System.out.println(anima2);
        System.out.println("==========animal1==========");
        System.out.println(animal1);

    }
}
