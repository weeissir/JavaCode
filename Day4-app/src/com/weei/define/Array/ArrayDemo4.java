package com.weei.define.Array;

public class ArrayDemo4 {
    public static void main(String[] args) {
        //动态初始化数组
        //数据类型[] 变量名 = new 数据类型[长度]
        int[] ages = new int[3];
        System.out.println(ages[0]);  //ages = [0,0,0]
        //后赋值
        ages[0] = 12;
        ages[1] = 3;
        ages[2] = 484;
        System.out.println(ages[2]);

        //动态数组元素默认值
        char[] c = new char[3];
        System.out.println((int)c[0]);  //0

        double[] s = new double[2];
        System.out.println(s[1]); //0.0

        boolean[] x = new boolean[4];
        System.out.println(x[3]); //false

        String[] v = new String[88];
        System.out.println(v[78]); //null
    }
}
