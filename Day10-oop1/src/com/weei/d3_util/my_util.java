package com.weei.d3_util;

import java.util.Random;
//定义一个生成验证码的工具类，这样在注册和登陆方法中都可以调用，不需要重复写
public class my_util {
    private my_util(){

    } //让外界不通过对象调用工具类，仅用类名即可
    public static String createcode(int n){
        //1、定义两个变量，一个记住最终产生的随机验证码，一个记住可能用到的全部字符
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxzyABCDEFGHIJKLMNOPQRSTUVWXZY0123456789";

        Random r = new Random();
        //2、开始定义一个循环产生每位随机字符
        for (int i = 0; i < n; i++) {
            //3、随机一个字符范围内的索引
            int index = r.nextInt(data.length());
            //4、根据索引从data中提取字符
            code += data.charAt(index);
        }
//        System.out.println(code);
        return code;
    }
}
