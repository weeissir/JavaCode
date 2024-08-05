package com.weei.d1_sort;

import java.util.Arrays;

public class Test1 {
/*
*       掌握冒泡排序的算法
* */
public static void main(String[] args) {
    //1、准备一个数组
    int[] arr = {5, 2, 3, 1};

    //2、定义一个循环控制排几轮
    for (int i = 0; i < arr.length - 1; i++) {

        //3、定义一个循环控制每轮比较几次
        for (int j = 0; j < arr.length - i -1 ; j++) {
            //判断当前位置和后一个的大小，大则交换
            if(arr[j] > arr[j + 1]){
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
}
}
