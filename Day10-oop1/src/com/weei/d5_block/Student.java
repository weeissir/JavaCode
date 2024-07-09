package com.weei.d5_block;

public class Student {
    static int number;
    static String name;

    //静态代码块
    static {
        System.out.println("静态代码块执行");
        name = "miamiamia";
        number = 80;
    }

    //实例代码块
    {
        System.out.println("实例代码块执行了");
    }

    public Student(){
        System.out.println("无参构造器执行了");
    }

    public Student(String name){
        System.out.println("有参构造器执行了");
    }
}
