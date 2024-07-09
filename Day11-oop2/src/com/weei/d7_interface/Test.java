package com.weei.d7_interface;

public class Test {
    public static void main(String[] args) {
        //认识接口
        System.out.println(A.SCHOOL_NAME);

        //接口不能创建对象（不能实例化）
//        A a = new A(); //报错
        //实现类调用接口的使用
        D d = new D();
        d.testb1();
        d.testb2();
    }
}
