package com.weei.d7_Thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest3 {
    public static void main(String[] args) throws Exception {
        //1、通过Executors创建一个线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);  //新建固定线程，核心=最大线程
//        Executors.newSingleThreadExecutor();
        //

        //2、使用线程处理Callable任务
        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));

        Future<String> f4 = pool.submit(new MyCallable(400)); //复用

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
    }
}
