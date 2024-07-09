package com.weei.d4_dtatic_attention;

public class Student {
    static String schoolname; //类变量

    double score; //实例方法

    //1、类方法中可以直接访问类的成员，不可以直接访问实例成员，
    public static void print(){
        //并且，同一个类中访问类成员，可以省略类名
        schoolname = "momo";//Student.schoolname = "momo";
        Student.print2();
//        System.out.println(score); //报错
//        Student.print3(); //报错
//        this.print3();//报错
    }

    //类方法
    public static void print2(){

    }

    //实例方法
    public void print3(){
        schoolname = "miamiamia";  //访问类成员
        score = 99.5; //访问实例成员
    }

    public void pass(){
        this.print3();
        this.score = 77;
    }
}
