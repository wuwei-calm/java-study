package com.test;

import com.test.modifier.PrivateTest;
import com.test.modifier.PublicTest;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        System.out.println(new PublicTest().name);
        //System.out.println(new PrivateTest().name);  //私有成员外部不可访问
    }
}
