package com.weei.loop;

public class ForDemo {
    public static void main(String[] args) {
        /**
         * 流程：
         * 首先执行初始化语句 int i = 0;
         * i = 0;判断条件 0<5 ,返回true ,进入循环执行代码，接着执行迭代t++
         * 。。。
         * i = 5,判断循环条件 5<5，返四false,循环就会立即结束。
         */
        for(int i = 0; i<5 ;i++ ){
            //i = 0,1,2,3,4,   5
            System.out.println("Hello World");
        }
        /*do{
            System.out.println("Hello");
        }while(true); //死循环*/
    }
}
