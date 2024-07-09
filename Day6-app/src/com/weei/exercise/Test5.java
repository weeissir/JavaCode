package com.weei.exercise;

public class Test5 {
    public static void main(String[] args) {
//        请把一个整型数组，例如存了数据:11，22，33，
//        拷贝成一个一一样的新数组出来。
        int[] arr = {23, 56, 46, 54};
        int[] arr2 = copy(arr);
        printarray(arr2);

    }
    public static int[] copy(int[] arr){
        //arr = 11,22,33
        //创建一个长度一样的数组
        int[] arr2 = new int[arr.length];
        //对应位置赋值给新数组
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void printarray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i == arr.length - 1)? arr[i] :(arr[i] + ", "));
        }
        System.out.println("]");
    }
}
//注意拷贝数组和赋值数组的区别，拷贝是创建了一个新数组，开辟了新内存地址
//赋值只是指向原数组地址