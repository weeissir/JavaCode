package com.weei.method.overload;

public class methodDemo {
    public static void main(String[] args) {
        test();
        test(4);
    }

    public static void test(){
        System.out.println("test1====");
    }
    public static void test(int a){
        System.out.println("test2" + a);
    }
    void test(int a,double b){
        System.out.println("test3");
    }
    //形参类型、个数相同时则不能重载
//    int test(int a){
//        return a;
//    }
    void test(double a, int b){

    }
}
