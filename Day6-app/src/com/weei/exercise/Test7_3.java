package com.weei.exercise;

public class Test7_3 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            if(check(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean check(int data){
        for (int i = 2; i <= data / 2; i++) {
            if(data % i == 0){
                return false; //不是素数
            }
        }
        return true; //是素数
    }
}

//将一个任务拆分成多个方法会简化很多
