package com.weei.api.d7_arrays;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    //重写该方法其实是给sort方法内部使用的
    //this o
    @Override
    public int compareTo(Student o) {
        //约定：左边对象大 返回正整数
        //  左边小  返回负整数
        //相等 返回0
        //例如，按照年龄升序
        /*if(this.age == o.age){
            return 0;
        }else{
            return (this.age - o.age > 0 ? 1 : -1);
        }*/
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
