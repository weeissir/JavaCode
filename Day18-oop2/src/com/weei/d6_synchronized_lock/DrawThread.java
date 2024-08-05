package com.weei.d6_synchronized_lock;

//创建的取钱线程类
public class DrawThread extends Thread{
    private Account acc;
    public DrawThread(Account acc, String name){
        super(name);
        this.acc = acc;
    }
    @Override
    public void run() {
        //执行取钱
        acc.DrawMoney(100000);
    }
}
