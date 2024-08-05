package com.weei.d1_parameter;

import java.util.Arrays;
import java.util.Locale;

public class ParamTest {
    /*
    * 认识可变参数，掌握其作用
    * */
    public static void main(String[] args) {
        //特点
        test(); //不传数据
        test(2);
        test(2, 0, 300);
        test(new int[]{12, 20, 30, 40,50});
        test2(17);
        test2(22,new double[]{9.2,45958,2});
        test2(33, 88.5, 44.5);
    }

    //1、形参列表中只能有一个可变参数
    //2、可变参数必须放在形参列表最后面
    public static void test2(int age, double...score) {
        System.out.println(age);
        System.out.println(Arrays.toString(score));
        System.out.println("-------------------");
    }

    public static void test(int...nums) {
        System.out.println(nums.length);  //可变参数在方法内部本质是一个数组
        System.out.println(Arrays.toString(nums));  //直接输出则显示数组地址
        System.out.println("-------------------");
    }

}
