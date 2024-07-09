package com.weei.api.d4_StringJoiner;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        //掌握StringJoiner的使用
        StringJoiner s = new StringJoiner(", ", "[", "]");
        s.add("momo1");//只能添加字符串类型数据
        s.add(2 + "");
        s.add('3' + "");
        System.out.println(s);

        System.out.println(getArrayData(new int[]{11, 22, 33}));
    }

    public static String getArrayData(int[] arr){
        //1、判断arr是否为null
        if(arr == null){
            return null;
        }
        //2、arr存在， arr = [11, 22, 33]
        StringJoiner sb = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
                sb.add(arr[i] + "");
        }
        return sb.toString();
    }
}
