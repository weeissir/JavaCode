package com.weei.d3_Thread_safe;
/*
* 模拟线程安全问题
* */
public class TheadsafeTest1 {
    public static void main(String[] args) {
        //1、创建一个账户对象，代表共享账户
        Account acc = new Account(100000,"MOMO");
        //2、创建两个线程，分别代表小明，小红
        new DrawThread(acc, "小明").start(); //小明
        new DrawThread(acc, "小红").start(); //小红
    }

}
