package com.weei.method;

public class methodDemo2 {
    public static void main(String[] args) {
        //按照需求，设计合理的方法
        //打印3行helloworld
        print();
        print2(7);
    }
    /**
     * 无参数，无返回值
     */
    public static void print(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello Wolrd");
        }
    }
    /*
    * 有参数，无返回值
    * */
    public static void print2(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Hello world");
        }
    }
}
