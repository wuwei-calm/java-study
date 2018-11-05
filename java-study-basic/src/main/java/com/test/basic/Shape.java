package com.test.basic;

/**
 * @author czg
 * @date 2018/5/23
 */
public class Shape {
    private String name;
    private Integer age;

    /**
     * 无参构造
     */
    public Shape(){}

    public Shape(String name,Integer age){
        this.age = age;
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String args[]){
        Shape shape = new Shape("shape",10);
        System.out.println(shape);
    }
}
