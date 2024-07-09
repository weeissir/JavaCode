package com.weei.api.d3_Stringbuilder;

public class Test3 {
    public static void main(String[] args) {
        //目标：完成遍历数组内容，并拼接成指定格式的案例
        int[] arr = {11, 22, 33};
        System.out.println(getArrayData(arr));
    }

    public static String getArrayData(int[] arr){
        //1、判断arr是否为null
        if(arr == null){
            return null;
        }
        //2、arr存在， arr = [11, 22, 33]
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
