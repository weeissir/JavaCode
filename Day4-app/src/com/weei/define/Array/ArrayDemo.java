package com.weei.define.Array;

import java.lang.reflect.Array;

public class ArrayDemo {
    public static void main(String[] args) {
        //静态初始化数组
        //1、数据类型[] 数组名=new 数据类型[]{元素1，元素2，元素3,...}
        int[] ages = new int[]{12, 24, 35};
        System.out.println(ages);  //数组变量存储的是内存地址
        //取值：数组名[索引]
        System.out.println(ages[2]);
        //赋值
        ages[0] = 99;
        System.out.println(ages[0]);
        double[] scores = new double[]{76.8, 98.9, 88, 96};
        //简化格式：数据类型[] 数组名 = {元素1，元素2，元素3,...}
        int[] ages2 = {12, 24, 35};
        //变式：数据类型 数组名[] 【开发中不推荐】
        int ages3[] = {23, 45, 56};
        String[] name = {"张三", "李四", "王五"};
        //访问数组元素个数
        System.out.println(name.length);
        //获取数组最大索引【前提：数组中存在数据】
        System.out.println(name.length - 1);
    }
}
