package com.weei.d9_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
* 多线程案例题
* */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        //有100份礼品，小红，小明两人同时发送，当剩下的礼品小于10份的时候则不再送出，
        // 利用多线程模拟该过程并将线程的名称打印出来。
        // 并最后在控制台分别打印小红，小明各自送出多少分礼物。

        //1、准备100份礼物
        List<String> gift = new ArrayList<>();
        String[] names = {"皇冠" , "荧光海", "玫瑰花", "大饼" , "巧克力"};
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            gift.add(names[r.nextInt(names.length)] + (i + 1));
        }
        System.out.println(gift);

        //2、定义线程类，创建线程对象，去集合种拿礼物给别人
        SendThread xm = new SendThread(gift, "小明");
        xm.start();
        SendThread xh = new SendThread(gift, "小红");
        xh.start();

        xm.join();  //让调用当前这个方法的线程先执行完
        xh.join();
//        SendThread.sleep(10000);  //或者睡觉等待前面执行完
        System.out.println(xm.getCount()); //再计数
        System.out.println(xh.getCount());
    }
}
