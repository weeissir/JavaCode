package com.weei.d2_thread_api;
/*
* 掌握sleep方法，join方法的作用
* */
public class ThreadDemo2 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if(i == 3){
                //当前执行的线程暂停5s，再继续执行（让程序变慢）
                Thread.sleep(5000);  //单位是ms
            }
        }

        //join方法：让当前调用这个方法的线程先执行完
        Thread t1 = new MyThread("1号线程");
        t1.start();
        t1.join();

        Thread t2 = new MyThread("2号线程");
        t2.start();
        t1.join();

        Thread t3 = new MyThread("3号线程");
        t3.start();
        t1.join();
    }
}
