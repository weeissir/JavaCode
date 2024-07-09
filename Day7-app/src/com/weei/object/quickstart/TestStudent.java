package com.weei.object.quickstart;

public class TestStudent {
    public static void main(String[] args) {
        //面向对象编程入门
//        1、创建一个学生对象
        Student s1 = new Student();
        s1.name = "张三";
        s1.math = 78.5;
        s1.chinese = 99.5;
        s1.computescore();
        s1.printscore();
        //再创建一个学生对象
        Student s2 = new Student();
        s2.name = "李四";

    }
}
