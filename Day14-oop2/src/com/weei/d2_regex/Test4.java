package com.weei.d2_regex;

import java.util.Arrays;

public class Test4 {
    /*
    * 目标：掌握使用正则表达式做搜索替换，内容分。
    * */
    public static void main(String[] args) {
//        1、public String replaceAll(String regex, String newstr):按照正则表达式匹配的内容进行替换
//        需求1:请把古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴，中间的非中文字符替换成“_"
        String s1 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        System.out.println(s1.replaceAll("\\w+", "-"));

//        2、public string[]split(String regex):按照正则表达式匹配的内容进行分割字符串，反回一个字符串数组。
//        需求1:请把古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴，中的人名获取出来。
        String s2 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs42425卡尔扎巴";
        String[] names = s2.split("\\w+");
        System.out.println(Arrays.toString(names));
    }
}
