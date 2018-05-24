package com.test.basic;

/**
 * @author czg
 * @date 2018/5/24
 */
public class Val {
    //全局静态变量
    private static String hello= "hello";
    public static void main(String args[]){
        String world = " world";//局部变量
        System.out.println(hello + world);
    }
}
