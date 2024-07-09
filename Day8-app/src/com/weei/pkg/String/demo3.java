package com.weei.pkg.String;

public class demo3 {
    public static void main(String[] args) {
        //1、String对象是不可变的
        String name  = "黑马";
        name += "程序员";  //String变量指向新的字符串
        name += "张三";
        System.out.println(name);

        //2、只要是以双引号给出的字符串对象，存储在常量池中，且内容相同时只存储一份
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2); //返回true，说明指向同一个内存地址

        //3、new String创建字符串对象，每次new出来的都是一个新对象，放在堆内存中
        char[] chars = {'a','b','c'};
        String a1 = new String(chars);
        String a2 = new String(chars);
        System.out.println(a1 == a2); //返回false，说明是两个不同的地址
    }
}
