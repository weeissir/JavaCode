package com.weei.varibale.scanner;

import java.util.Scanner;

public class scannerDemo {
    public static void main(String[] args) {
        //1、导包  idea可以自动导入
        //2、创建一个键盘扫描器Scanner对象
        Scanner sc = new Scanner(System.in);
        //3、调用sc的功能，接收用户键盘输入的数据
        System.out.println("请输入您的年龄： ");
        int age = sc.nextInt(); //等待用户输入一个整数，直到按下回车键，才拿到数据
        System.out.println("您的年龄是：" + age);
        System.out.println("请输入您的名字： ");
        String name  = sc.next(); //等待用户输入一个字符串，直到按下回车....
        System.out.println(name + "欢迎您进入系统");
    }
}
