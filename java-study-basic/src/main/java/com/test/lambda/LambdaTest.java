package com.test.lambda;

/**
 * @author czg
 * @date 2018/11/7
 */
public class LambdaTest {

    public static void main(String args[]){

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        new Thread(() -> System.out.println("Hello")).start();
    }
}
