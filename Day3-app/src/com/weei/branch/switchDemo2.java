package com.weei.branch;

public class switchDemo2 {
    public static void main(String[] args) {
        String week = "周三";
        switch (week){
            case "周一":
                System.out.println("解决bug");
                break;
            case "周二":
                System.out.println("拆迁");
                break;
            case "周三":
            case "周四":
            case "周五":
                System.out.println("开会");
                break;//周三到周五都会执行相同代码
            default:
                System.out.println("输入信息错误");
        }
    }
}
