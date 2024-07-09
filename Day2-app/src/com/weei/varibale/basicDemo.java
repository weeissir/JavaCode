package com.weei.varibale;

public class basicDemo {
    public static void main(String[] args) {
        // 目标：掌握ASCII编码表的编码特点
        System.out.println('a' + 10); //输出：107

        int a = 0141; //0开头的是八进制数
        System.out.println(a);

        int b = 0xbf; //0X开头的是十六进制
        System.out.println(b);

        //基本数据类型的注意事项
        //随便写一个整型字面量默认是int类型，如果希望是long类型的，后面加上L/l
        //随便写小数字面量，默认是double，如果希望小数是float，后面加上F/f
        long lg = 7537567858754L;
        float bb = 853.67764F;
        char cc = 's', dd = '吃';
        boolean flag = true; //布尔
        String name = "zhang三"; //注意S大写
        System.out.println(name);
        System.out.println(dd);

        //强制类型转换
        int re = 29;
        byte gf = (byte) re; //alt+回车 强制类型转换
        double ddd = 845.6;
        int kk = (int) ddd;
        System.out.println(kk);
    }
}
