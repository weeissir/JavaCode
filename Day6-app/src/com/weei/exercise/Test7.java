package com.weei.exercise;

public class Test7 {
    public static void main(String[] args) {
//        判断101-200之间有多少个素数，并输出所有素数。
//        找素数：除了1和它本身以外，不能被其他正整数整除，就叫素数。
        System.out.println("当前素数个数："  + search(101, 200));
    }
    public static int search(int n, int m){
        int count = 0;
        for (int i = n; i <= m; i++) {
            //判断当前数据是否是素数
            boolean flag = true;
            for (int j = 2; j <= i/2; j++) {
             //从2开始遍历到该数的一半的数据，看是否有数据可以整除它，有则不是素数
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            //根据判断结果决定是否输出i当前记住的数据
            if(flag){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
}


