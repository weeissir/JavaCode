package com.weei.api.d7_arrays;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysDemo1 {
    public static void main(String[] args) {
        //掌握Arrays类的常用方法
        //1、public static String toString(类型[]arr):返回数组的内容
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr)); //将数组内容拼接成字符串返回

        //2、public static int[] copyOfRange(类型[] arr，起始索引，结束索引):拷贝数组(指定范围，包前不包后)
        int[] arr2 = Arrays.copyOfRange(arr, 1,4);
        System.out.println(Arrays.toString(arr2));

        //3、public static copy0f(类型[]arr，int newLength):拷贝数组，可以指定新数组的长度
        int[] arr3 = Arrays.copyOf(arr, 10);  //多出来的默认补0，少一截的从前开始截取
        System.out.println(Arrays.toString(arr3));

        //4、public static setAll(double[] array,IntToDoubleFunction generator):把数组中的原数据改为新数据又存进去。
        double[] prices = {23.4, 56.4, 77};
        //所有价格打八折，再存进去
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return prices[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(prices));

        //5、public static void sort(类型[]arr):对数组进行排序(默认是升序排序)
        Arrays.sort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
