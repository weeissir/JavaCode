package com.weei.api.d2_integer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //掌握包装类的使用
//        Integer a1 = new Integer(12); //已过时
        Integer a2 = Integer.valueOf(12);
        System.out.println(a2);

        //自动装箱：可以自动把基本类型的数据转换成对象
        Integer a3 = 12;

        //自动拆箱：可以自动把包装类型的对象转换成对应的基本数据类型
        int a4 = a3;

        //泛型和集合不支持基本数据类型，只能支持引用数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a3);
        list.add(a2);
        list.add(12); //自动装箱
        int rs = list.get(1); //自动拆箱
        System.out.println("------------");

        //1、把基本类型的数据转换成字符串
        Integer a = 23;
        String rs1 = Integer.toString(a);//“23”
        System.out.println(rs1 + 1); //231

        String rs2 = a.toString();//“23”
        System.out.println(rs2 + 1);

        String rs3 = a + "";
        System.out.println(rs3 + 1);

        //2、把字符串类型的数值转换成对应的基本类型
        String agestr = "29";
//        int age = Integer.parseInt(agestr);//29
        int age = Integer.valueOf(agestr); //29
        System.out.println(age + 1); //30

        String scorestr = "78.5";
//        double score = Double.parseDouble(scorestr);//78.5
        double score = Double.valueOf(scorestr);
        System.out.println(score + 23);
    }
}
