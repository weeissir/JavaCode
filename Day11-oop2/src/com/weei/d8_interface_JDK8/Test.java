package com.weei.d8_interface_JDK8;

public class Test {
    public static void main(String[] args) {
        //掌握接口新增的三种方法形式
        B b =new B();
        b.test1();
        //直接用接口调用静态方法：
        A.test3();

    }
}
