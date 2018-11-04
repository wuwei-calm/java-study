package com.test.basic;

/**
 * @author czg
 * @date 2018/10/7
 */
public class IntToInteger {
    public static void main(String args[]){
        Integer a = new Integer(120);
        Integer b = Integer.valueOf(120);
        Integer c = 120;
        System.out.println(a == b);  // false
        System.out.println(a == c);   // false
        System.out.println(b == c);   //true;
    }
}
