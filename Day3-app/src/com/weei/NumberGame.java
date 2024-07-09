package com.weei;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        //随机产生一个1-100的数据
        Random r = new Random();
        int lucky = r.nextInt(100) + 1;
        //定义一个死循环，让用户一直猜值
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入数字： ");
            int guess = sc.nextInt();
            //判断大小
            if(guess > lucky){
                System.out.println("猜大了");
            }else if (guess < lucky){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了！");
                break;
            }
        }
    }
}
