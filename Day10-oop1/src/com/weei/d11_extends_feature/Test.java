package com.weei.d11_extends_feature;

public class Test {
    public static void main(String[] args) {
        //继承的注意事项
        //1、java是单继承的，一个类只能有一个直接父类，但支持多层继承

        //2、Object类是java中所有类的祖宗类
        A a = new A();
        a.hashCode();//a对象中默认的那些方法都是Object中的方法

        B b = new B();
        b.toString();//b对象间接继承Object类
    }

}

class A{}  //extends Object{}
//多层继承可以
class B extends A{}

//class C extends B, A{} //报错：Class cannot extend multiple classes
class C extends B{}