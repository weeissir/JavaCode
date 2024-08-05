package com.weei.d1_sort;

import java.util.Arrays;

public class Test2 {
    /*
    *   掌握选择排序
    * */
    public static void main(String[] args) {
        //1、准备一个数组
        int[] arr = {5, 3, 1, 2};

        //2、控制选择几轮
        for (int i = 0; i < arr.length - 1; i++) {
            //i = 0 第一轮 j = 1 2 3
            //i = 1 第二轮 j = 2 3
            //i = 2 第三轮 j = 3
            //3、控制每轮选择几次
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //判断当前位置是否大于后面处的元素值，大于则交换
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //决定是否交换
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
