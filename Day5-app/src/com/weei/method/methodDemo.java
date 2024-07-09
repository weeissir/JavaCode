package com.weei.method;

public class methodDemo {
    public static void main(String[] args) {
        //掌握方法的定义
        //需求：数据求和
        int a =99, b =70;
        int rs = sum(a ,b);
        System.out.println(rs);
    }
    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}
