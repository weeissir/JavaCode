package com.weei.d13_extends_visit;

public class Zi extends Fu{
    String name = "子类名字";

    public void showName(){
        String name = "局部名称";
        System.out.println(name);  //就近访问局部名称
        System.out.println(this.name);  //子类名字
        System.out.println(super.name); //父类名字
    }

    @Override
    public void print1() {
        System.out.println("==子类的print1方法==");;
    }

    public void showMethod(){
        print1(); //子类的
        super.print1(); //父类的
    }
}
