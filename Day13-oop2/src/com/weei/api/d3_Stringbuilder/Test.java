package com.weei.api.d3_Stringbuilder;

public class Test {
    public static void main(String[] args) {
         //掌握StringBuilder的用法和作用
        StringBuilder s = new StringBuilder(); //s = “”创建一个空白的可变字符串对象
        StringBuilder s1 = new StringBuilder("momo");

        //1、拼接内容
        s1.append(14);
        s1.append("jfiwgj4");
        s1.append(true);
        System.out.println(s1);

        //支持链式编程
        s1.append(666).append('B').append("hi发货");

        System.out.println(s1);

        //2、反转操作
        s1.reverse();
        System.out.println(s1);

        //3、返回字符串的长度
        System.out.println(s1.length());

        //4、把StringBuilder对象又转换成String类型
        String rs = s1.toString();
        System.out.println(rs);
    }
}
