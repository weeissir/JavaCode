package com.weei.exercise;

public class Test7_2 {
    public static void main(String[] args) {
//        判断101-200之间有多少个素数，并输出所有素数。
//        找素数：除了1和它本身以外，不能被其他正整数整除，就叫素数。
        System.out.println("当前素数个数："  + search(101, 200));
    }
    public static int search(int n, int m){
        int count = 0;
        OUT: //为外部循环指定标签
        for (int i = n; i <= m; i++) {
            //判断当前数据是否是素数

            for (int j = 2; j <= i/2; j++) {

                if(i % j == 0){
                   //不能打印
                    continue OUT; //结束外部循环的当次执行
                }
            }

                System.out.println(i);
                count++;

        }
        return count;
    }
}
