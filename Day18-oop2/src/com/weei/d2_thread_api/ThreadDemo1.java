package com.weei.d2_thread_api;
/*
* 掌握Thread的常用方法
* */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("1号线程");
//        t1.setName("1号线程"); //启动前取名字
        t1.start();
//        System.out.println(t1.getName());
//        System.out.println(t1.getId());

        Thread t2 = new MyThread("2号线程");
//        t2.setName("2号线程");
        t2.start();
//        System.out.println(t2.getName());
//        System.out.println(t2.getId());

        //主线程对象的名字
        //哪个线程当前执行，就会得到哪个对象
        Thread m = Thread.currentThread();
        m.setName("最牛线程");
        System.out.println(m.getName());

        for (int i = 0; i < 3; i++) {
            System.out.println(m.getName() + "输出：" + i);
        }

    }
}
