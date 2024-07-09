package com.weei.d1_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：认识多态：对象多态、行为多态
        //1、对象多态
        People p1 = new Teacher();
        People p2 = new Student();
        //2、行为多态
        p1.run();//识别技巧：编译看左边，运行看右边
        p2.run();//同样的行为在不同对象下表现不同特征

        //3、成员变量没有多态
        System.out.println(p1.name);//编译看左边，运行看左边
        System.out.println(p2.name);//成员变量没有多态。

    }
}
