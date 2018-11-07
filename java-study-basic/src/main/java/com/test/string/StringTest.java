package com.test.string;

/**
 * @author czg
 * @date 2018/11/7
 */
public class StringTest {
    public static void main(String args[]){
        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());

        String name = "Hello";
        System.out.println(name.hashCode());
        name = "World";
        System.out.println(name.hashCode());
    }
}
