package com.weei.d2_polymorphism;

public class Student extends People {
    public String name = "Student的名字";
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }

    public void test(){

    }
}
