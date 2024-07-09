package com.weei.object.constructor;

public class Student {
    String name;
    double score;
    //无参构造器
    public Student(String name, double score){
        this.name = name;
        this.score = score;
    }
    //有参构造器
    public Student(String name){
        System.out.println("有参构造器被触发执行了");
    }
}
