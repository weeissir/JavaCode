package com.weei.object.encapsulation;

public class Student {
    private double score;
    //一般成员变量都隐藏，用方法来调用
    public void setScore(double score){
        if(score >=0 && score <= 100){
            this.score = score;
        }else{
            System.out.println("数据非法");
        }

    }
    public double getScore(){
        return score;
    }
    private void printPass(){
        System.out.println(score >= 60? "成绩合格" : "成绩不合格");
    }
}
