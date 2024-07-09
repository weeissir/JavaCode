package com.weei.exercise;

public class Test8_2 {
    public static void main(String[] args) {
        //打印三角形
/**
     *
    ***
   *****
  *******
 本质：计算机只能打印行，因此要按照行思考。
 先找规律，再写程序
 行    先打空格(n-i)   再打星星(2i-1)   换行
 1     3            1
 2     2            3
 3     1            5
 4     0            7
 * */
        star(9);
    }
    public static void star(int n){
        //先定义一个循环控制打印多少行
        for (int i = 1; i <= n; i++) {
            //控制打印多少空格
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            //控制打印多少星星
            for (int k = 1; k <= (2*i -1); k++) {
                System.out.print("*");
            }
            //换行
            System.out.println();
        }
    }
}
