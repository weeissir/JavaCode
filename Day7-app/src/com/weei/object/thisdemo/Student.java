package com.weei.object.thisdemo;

public class Student {
    double score;

    public void printThis(){
        System.out.println(this);
    }

    public void printPass(double score){
        //成员变量与形参变量名称相同时，可以用this避免冲突
        if(this.score > score){
            System.out.println("恭喜您，成功考入");
        }else{
            System.out.println("落选了");
        }
    }
}
