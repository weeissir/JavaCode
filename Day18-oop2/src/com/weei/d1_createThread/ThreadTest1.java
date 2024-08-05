package com.weei.d1_createThread;
/*
* 掌握线程的创建方式一：继承Thread类
* */
public class ThreadTest1 {
    //main方法由默认的一条主线程负责执行
    public static void main(String[] args) {
        //3、创建MyThread线程类的对象代表一个线程
        Thread t = new MyThread(); //多态的写法
        //4、启动线程（run方法）
        t.start();
//        t.run();//只是简单调用run方法，并没有启动子线程
        //主线程任务要放在子线程下面，才会同时执行
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出" + i);
        }
    }
}
