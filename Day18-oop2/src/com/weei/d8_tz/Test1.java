package com.weei.d8_tz;
/*
* 拓展：悲观锁、乐观锁的概念
* */
public class Test1 {

    public static void main(String[] args) {
        //需求：1个静态变量，100个线程，每个线程对其加100次
        Runnable target = new MyRunnable(); //一个任务

        for (int i = 0; i < 100; i++) {
            new Thread(target).start();  //100个线程
        }
    }
}
