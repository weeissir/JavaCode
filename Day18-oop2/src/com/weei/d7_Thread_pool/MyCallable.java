package com.weei.d7_Thread_pool;

import java.util.concurrent.Callable;

/*
* 1、让这个类实现Callable接口
* */
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    //2、重写call方法
    @Override
    public String call() throws Exception {
        //描述线程任务，返回执行后的结果
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "线程求出了1-" + n + "的和是："+ sum;
    }
}
