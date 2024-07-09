package com.weei.d5_enum;

public class Test {
    //认识枚举
    public static void main(String[] args) {
        A a1 = A.X;
        System.out.println(a1);

        //枚举类的构造器是私有的，不能创建对象
//        A a = new A();//报错
        A a2 = A.Y;

        //枚举类提供一些额外的API
        A[] as = A.values();//拿到全部对象
        A a3 = A.valueOf("Z");
        System.out.println(a3.name()); //Z
        System.out.println(a3.ordinal()); //索引 2
        System.out.println("---------");

        B y = B.Y;
        y.go();
    }
}
