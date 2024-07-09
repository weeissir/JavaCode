package com.weei.branch;

public class switchDemo {
    public static void main(String[] args) {
        String week = "周八";
        switch (week){
            case "周一":
                System.out.println("解决bug");
                break;
            case "周二":
                System.out.println("拆迁");
                break;
            case "周三":
                System.out.println("开会");
                break;
            default:
                System.out.println("输入信息错误");
        }
        //表达式类型只支持：char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
        int a = 10;
        int d = 40;
        switch(a){
            case 10:
                break;
            case 20: //case给出的值不能重复
                break;
            case 30:
                break;
            case 40://d: //case给出的值只能是字面量，不能是变量
                break;
        }
    }
}
