package com.test.weightfly;

import java.util.HashMap;
import java.util.Map;

/**
 * @author czg
 * @date 2019/6/19
 */
public class MyStringFactory {
    private Map<String ,MyString> pool;

    public Map<String, MyString> getPool() {
        return pool;
    }

    public void setPool(Map<String, MyString> pool) {
        this.pool = pool;
    }

    public MyStringFactory(){
        pool = new HashMap<String,MyString>();
    }

    public MyString getMyString(String str){
        MyString mystr = pool.get(str);
        if(mystr == null){
            mystr = new MyString(str);
            pool.put(str,mystr);
        }
        return mystr;
    }
}
