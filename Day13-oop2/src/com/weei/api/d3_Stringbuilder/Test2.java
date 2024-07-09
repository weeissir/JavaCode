package com.weei.api.d3_Stringbuilder;

public class Test2 {
    public static void main(String[] args) {
        //掌握StringBuilder的好处
        //需求：拼接100万次abc
        //先用String测试看看性能
/*        String rs = "";
        for (int i = 0; i < 1000000; i++) {
            rs = rs + "abc";  //不断地指向新对象
        }
        System.out.println(rs);*/

        //使用StringBuilder看看性能
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            rs.append("abc"); //始终往这一个对象中添加数据
        }
        System.out.println(rs);
    }
}
