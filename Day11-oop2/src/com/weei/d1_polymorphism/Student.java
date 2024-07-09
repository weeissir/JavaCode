package com.weei.d1_polymorphism;

public class Student extends People{
    public String name = "Student的名字";
    @Override
    public void run() {
        System.out.println("学生跑得快");
    }
}
