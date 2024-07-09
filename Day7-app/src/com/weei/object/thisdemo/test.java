package com.weei.object.thisdemo;

public class test {
    public static void main(String[] args) {
        // 目标：认识this，掌握this的应用场景
        Student s = new Student();
        s.printThis();
        System.out.println(s);//同一个地址
        s.score = 678;
        s.printPass(456);
    }}
