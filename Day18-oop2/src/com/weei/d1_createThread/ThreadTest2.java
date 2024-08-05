package com.weei.d1_createThread;
/*
 * 掌握线程的创建方式二：实现Runnable接口
 * */
public class ThreadTest2 {
    public static void main(String[] args) {
        //3、创建对象
        Runnable target = new MyRunnable();
        //4、把任务对象交给一个线程对象
        new Thread(target).start();

        //--------------------------
        //多线程创建方式二的匿名内部类写法
        Runnable target2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程22输出" + i);
                }
            }
        };
        new Thread(target2).start();

        //简化形式1
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程22输出" + i);
                }
            }
        }).start();

        //继续简化 lambda写法
        new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程22输出" + i);
                }
        }).start();

        //主线程
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出" + i);
        }
    }
}
