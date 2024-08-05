package com.weei.d2_regex;

public class Test1 {
    /*
    * 目标:体验一下使用正则表达式来校验数据格式的合法性。
    * 需求:按验QQ号码是否正确，要求全部是数字，长度是(6-20)之间，不能以0开头
    * */
    public static void main(String[] args) {
        System.out.println(checkQQ("3847657gd"));
        System.out.println(checkQQ("0385743"));
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("8749287345"));
    }

    public static boolean checkQQ(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }
}
