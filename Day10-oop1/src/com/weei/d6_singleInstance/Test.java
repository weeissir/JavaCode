package com.weei.d6_singleInstance;

public class Test {
    public static void main(String[] args) {
        //掌握单例设计模式的写法
        A a1 = A.getObject();
        A a2 = A.getObject();
        System.out.println(a1);
        System.out.println(a2);  //返回同一个地址，说明A只会生成一个对象

        //懒汉式：
        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println("-----");
        System.out.println(b2);
        System.out.println(b1);
    }
}
