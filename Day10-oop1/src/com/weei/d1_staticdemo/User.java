package com.weei.d1_staticdemo;

public class User {
    //类变量 【通常公开】
    public static int number;

    public User(){
        //User.number++;
        //在同一个类中，访问自己类的类变量，可以省略类名不写
        number++;
    }
}
