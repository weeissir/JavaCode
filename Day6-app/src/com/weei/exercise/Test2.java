package com.weei.exercise;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
//        开发一个程序，可以生成指定位数的验证码，每位可以是数字、大小写字母。
        System.out.println(createcode(5));
    }
    public static String createcode(int n){
        //控制位数
        Random r = new Random();
        String code = ""; //准备一个字符串将生成的验证码连接起来
        for (int i = 1; i <= n; i++) {
            //为每个位置随机生成一个字符
            //思路：随机一个0-2，分别代表大小写字母、数字
            int type = r.nextInt(3);//0,1,2
            switch (type) {
                case 0:
                    //随机一个数字
                    code += r.nextInt(10);
                    break;
                case 1:
                    //随机一个大写字符 A:65 Z 65+25
                    char ch1 = (char) (r.nextInt(26) + 65); //alt+enter
                    code += ch1;
                    break;
                case 2:
                    //随机一个小写字符 a 97 z 97 +25
                    char ch2 = (char) (r.nextInt(26) + 97); //alt+enter
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
