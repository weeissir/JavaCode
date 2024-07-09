package com.weei.d7_extends;

public class Test {
    public static void main(String[] args) {
        //认识继承，掌握继承的特点
        //子类创建对象时，是子类和父类共同完成的
        B b = new B();
        //可以访问A B中公开的成员
        System.out.println(b.i);
        b.print1();
        b.print3();
    }
}
