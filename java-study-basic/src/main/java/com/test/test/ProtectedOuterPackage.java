package com.test.test;

import com.test.modifier.Child;

/**
 * @author czg
 * @date 2018/11/7
 */
public class ProtectedOuterPackage {
    public static void main(String args[]){
        //在包的外部不可访问
        //System.out.println(new Child().name);
    }

}
