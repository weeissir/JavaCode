package com.weei.d2_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
    /*
    * 使用正则表达式爬取信息
    * */
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        String data = "来黑马程序员学习Java，\n" +
                "电话:1866668888，18699997777\n" +
                "或者联系邮箱:boniu@itcast.cn，\n" +
                "座机电话:01036517895，010-98951256\n"+
                "邮箱:bozai@itcast.cn，\n"+
                "邮箱:dlei0009@163.com，\n"+
                "热线电话:400-618-9090，400-618-4000，4006184000，4006189090";
        //1、定义爬取规则
        String regex = "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})" +
                "|(400-?\\d{3,7}-?\\d{3,7})" ;
        //2、把正则表达式封装成Pattren对象
        Pattern pattern = Pattern.compile(regex);
        //3、通过pattern对象获取查找内容的匹配器对象
        Matcher matcher = pattern.matcher(data);
        //4、定义一个循环开始爬取信息
        while (matcher.find()){
            String rs = matcher.group(); //获取到了内容
            System.out.println(rs);
        }
    }
}
