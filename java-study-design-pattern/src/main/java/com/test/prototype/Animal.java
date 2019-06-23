package com.test.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czg
 * @date 2019/6/23
 */
public class Animal implements Cloneable{
    private String name;
    private int age;
    private List<String> list= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    //浅克隆
    @Override
    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
