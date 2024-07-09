package com.weei.define.Array;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        //某歌唱比赛，需要开发一个系统:可以录入6名评委的打分，录入完毕后立即输出平均分做为选手得分
        // 定义数组
        double[] scores = new double[6];
        //定义一个扫描器
        Scanner sc = new Scanner(System.in);
        //遍历每个位置，录入分数
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入当前第" + (i + 1) + "个评委的分数");
            scores[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("选手最终得分： "+ sum / scores.length);
    }
} 
