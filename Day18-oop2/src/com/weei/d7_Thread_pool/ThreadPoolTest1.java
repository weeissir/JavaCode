package com.weei.d7_Thread_pool;

import java.util.concurrent.*;

/*
* 掌握线程池的创建
* */
public class ThreadPoolTest1 {
    public static void main(String[] args) {
         ExecutorService pool = new ThreadPoolExecutor(3, 5, 8,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(4), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy());

         Runnable target = new MyRunnable();
         pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务
         pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务
         pool.execute(target); //线程池会自动创建一个新线程，自动处理这个任务 【三个核心线程忙碌】

         pool.execute(target); //复用前面的核心线程
         pool.execute(target); //复用前面的核心线程
         pool.execute(target); //复用前面的核心线程
         pool.execute(target); //复用前面的核心线程  【四个队列占满】

         pool.execute(target); // 创建临时线程
         pool.execute(target); // 创建临时线程  【两个临时线程忙碌】

         pool.execute(target); // 新任务拒绝时机

        //关闭很少用
//        pool.shutdown(); //等待线程池中任务执行完毕，再关闭线程池
//        pool.shutdownNow();//立刻关闭线程池，不管任务是否执行完成


    }
}
