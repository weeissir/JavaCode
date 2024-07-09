package com.weei.api.d1_api_object;

public class test {
    public static void main(String[] args) {
        //掌握object类提供的常用方法
        Student s1 = new Student("赵敏", 23);
        System.out.println(s1.toString());//返回对象的字符串地址，一般会重写

        Student s2 = new Student("赵敏", 23);
        System.out.println(s2.equals(s1));//false 默认比较地址。一般会重写
        System.out.println((s1 == s2)); //false 默认比较地址
    }
}
