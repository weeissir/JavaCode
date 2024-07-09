package com.weei.d7_extends;

//B：子类 ，A：父类
public class B extends A{
    private int k;
    //子类可以继承（用）父类的非私有成员
    public void print3(){
        System.out.println(i);
        print1();
//        System.out.println(j);//报错
    }
}
