package com.weei.d8_tz;

public class MyRunnable implements Runnable{
    private int number; //记录浏览人次
    @Override
    public void run() {
        //加100次
        for (int i = 0; i < 100; i++) {
            //悲观锁
           synchronized (this){ //this代表MyRunnable对象，只new了一次可以作为锁
               System.out.println(Thread.currentThread().getName() + "count---->" + (++number));
           }
        }
    }
}
