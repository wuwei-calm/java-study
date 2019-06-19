package com.test.weightfly;

/**
 * @author czg
 * @date 2019/6/19
 */
public class Main {
    public static void main(String args[]){
        MyStringFactory myStringFactory = new MyStringFactory();
        MyString m1 = myStringFactory.getMyString("a");
        MyString m2 = myStringFactory.getMyString("a");
        MyString m3 = myStringFactory.getMyString("b");
        MyString m4 = myStringFactory.getMyString("c");
        System.out.println(myStringFactory.getPool().size());
    }

}
