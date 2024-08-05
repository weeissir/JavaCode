package com.weei.d1_createThread;

//1、让子类继承Thread类
public class MyThread extends Thread{
    //2、重写run方法

    @Override
    public void run() {
        //描述线程的执行任务
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread子线程输出" + i);
        }
    }
}
