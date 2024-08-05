package com.weei.d1_createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
* 掌握线程创建方式三：实现Callable接口
* */
public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //3、创建一个Callable对象
        Callable<String> call = new MyCallable(100);
        Callable<String> call2 = new MyCallable(200);
        //4、把Callable对象封装成FutureTask对象
        //是一个任务对象，实现了Runnable对象
        //可以在线程执行完毕后，用未来任务对象调用get方法获取线程执行完毕后的结果
        FutureTask<String> f1 = new FutureTask<>(call);
        FutureTask<String> f2 = new FutureTask<>(call2);
        //5、把任务对象交给Thread对象
        new Thread(f1).start();
        new Thread(f2).start();
        //6、获取线程执行后返回的结果
        //注意：如果上面的线程还没执行结束，运行到这里会暂停
        String s = f1.get();
        System.out.println(s);

        String s2 = f2.get();
        System.out.println(s2);
    }
}
