package com.weei.d1_sort;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        //掌握二分查找算法
        int[] arr = {1, 3, 5, 22, 34};
        System.out.println(binarySearch(arr, 34));

        //java自带的算法
        System.out.println(Arrays.binarySearch(arr, 22));

    }

    public static int binarySearch(int[] arr, int data){
        //1、定义两个变量，一个站在左边，一个最右
        int left = 0;
        int right = arr.length - 1;

        //2、定义一个循环控制折半
        while(left <= right){
            //3、每次折半，算出中间位置索引
            int middle = (left + right) / 2;
            //4、判断当前要找的元素与中间位置大小
            if(data < arr[middle]){
                //向左找， 截至位置 右 = 中间 - 1
                right = middle - 1;
            }else if (data > arr[middle]){
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1; //表示没找到
    }
}
