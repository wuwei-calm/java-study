package com.test.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author czg
 * @date 2018/11/7
 */
public class SteamTest {
    public static void main(String args[]){
        Map<String,Object[]> map = new HashMap<>();
        map.put("one",new Integer[]{1});
        map.put("two",new Integer[]{2});
        map.put("three",new Integer[]{3});
        String params = map.entrySet().stream().map(entry -> entry.getKey() + ":" + Arrays.toString(entry.getValue()))
                .collect(Collectors.joining(", "));
        System.out.println(params);


    }
}
