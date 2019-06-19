package com.test.adapter;

/**
 * @author czg
 * @date 2019/6/19
 */
public class Adapter extends CurrentSource {
    public void use18V(){
        System.out.println("使用电源适配器");
        super.use220V();
    }
}
