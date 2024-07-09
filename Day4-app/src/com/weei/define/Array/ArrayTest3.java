package com.weei.define.Array;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    public static void main(String[] args) {
        //数组元素找最大值
        //定义数组
        int[] scores = new int[]{155, 300, 45, -6, 3546, 324};
        //定义最大值
        int max = scores[0];
        //遍历
        for (int i = 1; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("最大值为： " + max);

        //某个数组有5个数据:10,20,30,40,50，请将这个数组中的数据进行反转。
        int[] data = new int[]{10,20,30,40,50};
        //定义循环，前后两个变量
        for (int i = 0, j = data.length - 1; i < j; i++, j--) {
            int temp = 0; //临时变量
            temp = data[j];
            data[j] = data[i];
            data[i] = temp;
        }
        //查看反转
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " "); //print不加ln不换行
        }

        //某公司开发部5名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。请先依次录入5名员工的工号，然后展示出一组随机的排名顺序。
        //动态数组初始化
        int[] nums = new int[5];
        //录入数据
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第：" + (i+1) + "个工号");
            int num = sc.nextInt();
            nums[i] = num;
        }
        // 打乱数据
        Random r  = new Random();
        for (int i = 0; i < nums.length; i++) {
            int index = r.nextInt(nums.length); //0-4
            int temp = 0;
            temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
        }
        //查看打乱工号
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
