package com.weei.branch;

public class IFdemo {
    public static void main(String[] args) {
        //if的三种形式
        double t = 38.9;
        if (t >37){
            System.out.println("温度异常");
        }

        double money = 76;
        if(money>90){
            System.out.println("发红包成功");
        }else{
            System.out.println("余额不足");
        }

        int score = 78;
        if(score >=0 && score <60){
            System.out.println("等级为：D");
        }else if(score >=60 && score <80){
            System.out.println("等级为：C");
        }else if(score >=80 && score <=100){
            System.out.println("等级为：A");
        }else{
            System.out.println("成绩录入异常");
        }
    }
}
