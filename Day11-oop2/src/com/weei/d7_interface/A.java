package com.weei.d7_interface;

public interface A {
    //成员变量（java默认常量）
    public final static String SCHOOL_NAME = "momo大学";
    //public final static变灰，意思是默认有，可以不写

    //成员方法（默认是抽象方法）
    public abstract void test();
    //public abstract 变灰，意思是默认为抽象类，可以省略

    //其他内容都不能存在
//    public void test(){//其他成员方法报错
//
//    }

//    public A(){}; //构造器报错
}
