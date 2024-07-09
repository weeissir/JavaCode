package com.weei.d1_staticdemo;

public class Test {
    //目标：掌握有无static修饰成员变量的用法，特点
    public static void main(String[] args) {
        // 1、类变量用法
        Student.name = "momo";

        //对象.类变量（不推荐）
        Student s1 = new Student();
        s1.name = "papa";

        Student s2 = new Student();
        s2.name = "喵喵喵";

        System.out.println(s1.name); //有static修饰，属于类，在计算机里只有一份，会被类的全部对象共享

        //2、实例变量的用法，属于每个对象的变量【只能用对象访问】
        s1.age = 13;
        s2.age = 20;
        System.out.println(s1.age);
        System.out.println(s2.age);

    }

}
