package com.weei.pkg.String;

public class demo {
    public static void main(String[] args) {

        //直接双引号得到字符串对象，封装字符串数据
        String name = "hatethis";
        System.out.println(name);

        //调用构造器初始化字符串
        String anna = new String();
        anna = "anna";
        System.out.println(anna);

        String rs = new String("name");

        //字符数组转成字符串
        char[] chars = {'a', 'b', 'c'};
        String rs2 = new String(chars);
        System.out.println(rs2);

        //字节数组转成字符串
        byte[] bytes = {97, 98, 99};
        String rs3 = new String(bytes);
        System.out.println(rs3); //abc

    }
}
