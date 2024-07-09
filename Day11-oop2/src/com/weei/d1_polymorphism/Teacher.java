package com.weei.d1_polymorphism;

public class Teacher extends People{
    public String name = "Teacher的名字";
    @Override
    public void run() {
        System.out.println("老师跑得慢");
    }
}
