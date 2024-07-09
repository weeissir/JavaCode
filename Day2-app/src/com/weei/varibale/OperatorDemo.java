package com.weei.varibale;

public class OperatorDemo {
    public static void main(String[] args) {
        //掌握基本算术运算符使用
        System.out.println(5 / 2); //字面量整数相除只会保留整数
        System.out.println(5.0 / 2);  //可以得到小数
        System.out.println(3 % 2); //取余

        // “+” 的使用 连接符 [能算则算，不能算就连在一起]
        int a2 = 5;
        System.out.println("abc" + a2); //: abc5
        System.out.println(a2 + 5); // :10
        System.out.println("shfid" + a2 + 'd'); //: shfid5d
        System.out.println(a2 + 'a' + "nnn"); // : 102nnn

        // 自增、自减
        int t = 10;
        int re = t++; //【re = t ,t = t+1】
        int re2 = ++t;//[t = t+1, re = t]
        System.out.println(re);
        System.out.println(re2);

        //三元运算符
        double score = 98.5;
        String rs = score >=60 ? "成绩及格" : "成绩不及格";
        System.out.println(rs);
        //三元运算符找两个整数中的较大值
        int aaa = 10;
        int bbb = 45;
        int max = aaa > bbb ? aaa : bbb;
        System.out.println(max);
        //三元运算符找三个整数中的较大值
        int z = 34;
        int x = 24;
        int c = 86;
        int temp = z>x? z: x;
        int max2 = temp>c? temp :c;
        System.out.println(max2);


    }
}
