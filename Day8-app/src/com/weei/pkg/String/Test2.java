package com.weei.pkg.String;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母
        System.out.println(createcode(6));
    }

//    1、设计一个方法，该方法接收一个整型参数，最终要返回对应位数的随机验证码
public static String createcode(int n){
    //   2、 方法内定义2个字符串变量:
//   1个用来记住生成的验证码，1个用来记住要用到的全部字符
    String code = "";
    String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random r = new Random();
    //   3、 定义for循环控制生成多少位随机字符
    for (int i = 0; i < n; i++) {
        //4、随机一个字符范围内的索引
        int index = r. nextInt(data.length());
        //5、根据索引去全部字符中找该字符
        code += data.charAt(index);
    }
    //6、返回code
    return code;
}

}
