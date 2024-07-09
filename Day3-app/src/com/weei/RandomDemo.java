package com.weei;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        //创建一个Random对象
        Random r = new Random();
        //调用功能
        for (int i = 0; i < 5; i++) {
            int data = r.nextInt(10);//nextInt(n)功能只能生成:0至n-1之间的随机数，不包含n。
            System.out.println(data);
        } //ctrl + alt + T 快速选择循环结构
    }
}
