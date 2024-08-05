package com.weei.d1_createThread;

//1、定义一个任务类，实现Runnable接口
public class MyRunnable implements Runnable{
    //2、重写run方法
    @Override
    public void run() {
        //描述线程的执行任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}
