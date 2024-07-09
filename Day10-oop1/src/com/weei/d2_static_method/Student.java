package com.weei.d2_static_method;

public class Student {

    double score;

    public static void print(){
        System.out.println("Hello,world");
    }

    public void pass(){
        System.out.println("成绩：" + (score >= 60? "及格" : "不及格"));
    }
}
