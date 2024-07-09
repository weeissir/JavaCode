package com.weei.d2_static_method;

public class Test {
    public static void main(String[] args) {
        // 掌握有无static修饰方法的用法

        //1、类方法的用法
        //类名。类方法（推荐）
        Student.print();

        //2、用对象访问（不推荐）
        Student s = new Student();
        s.print();

        s.score = 89;

        //2、实例方法的用法
        //对象。实例方法
        s.pass();
//        Student.pass();//报错
    }
}
