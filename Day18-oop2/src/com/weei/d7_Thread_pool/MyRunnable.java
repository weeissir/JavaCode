package com.weei.d7_Thread_pool;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //执行内容
        System.out.println(Thread.currentThread().getName() + "输出66");
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
