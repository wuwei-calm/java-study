package com.test;

import com.test.api.HelloService;

import java.util.UUID;

/**
 * @author czg
 * @date 2019/2/27
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return UUID.randomUUID().toString();
    }
}
