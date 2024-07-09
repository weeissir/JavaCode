package com.weei.define.Array;

public class ArrayTest {
    public static void main(String[] args) {
        //某部门5名员工的销售额分别是:16、26、36、6、108，请计算出他们部门的总销售额
        //定义数组
        int[] money = {16, 26, 36, 6, 108};
        //遍历
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println("销售总额： " + sum);
    }
}
