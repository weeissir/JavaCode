package com.weei.exercise;

public class Test8 {
    public static void main(String[] args) {
        //打印99乘法表
        //定义for循环控制打印多少行
        for (int i = 1; i <= 9 ; i++) {
            //定义一个循环控制每行打印多少列
            for (int j = 1; j <= i; j++) {
                //i=行 j=列
                System.out.print(j + "×" + i + "=" + (j * i) + "\t");
            }
            System.out.println(); //换行
        }
    }
}
