package com.weei.exercise;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        在唱歌比赛中，可能有多名评委要给选手打分，分数是[0-100]之间的整数。
//        选手最后得分为:去掉最高分、最低分后剩余分数的平均分，
//        请编写程序能够录入多名评委的分数，并算出选手的最终得分。
        System.out.println("当前选手得分是："+ Getscores(4)) ;
    }
    public static double Getscores(int n){
        //准备一个动态初始化数组，存入打分
        int[] scores = new int[n];
        //准备一个扫描器录入分数
        Scanner sc = new Scanner(System.in);
        //遍历数组每个位置，录入分数
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) +"个评委的分数");
            scores[i] = sc.nextInt();
        }
        //计算总分、最高、最低
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        //遍历数组找数据
        for (int i = 0; i < n; i++) {
            sum += scores[i];
            if(scores[i] > max){
                max = scores[i];
            }
            if(scores[i] < min){
                min = scores[i];
            }
        }
        double avg = 1.0 *(sum - max - min) /(n - 2);
        return avg;
    }

}
