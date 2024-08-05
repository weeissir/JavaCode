package com.weei.d2_regex;

import java.util.Scanner;

public class Test2 {
    /*
    * 掌握正则表达式
    * 需求：校验用户输入的电话、邮箱、时间是否合法
    * */
    public static void main(String[] args) {
//        checkPhone();
        checkemail();
    }

    private static void checkPhone() {
        while (true){
            System.out.println("请输入电话号码（手机、座机）");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            //18738450394 010-846583 0103947593
            if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确");
                break;
            }else{
                System.out.println("您输入的号码格式不正确");
            }
        }
    }

    private static void checkemail() {
        while (true){
            System.out.println("请输入邮箱");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            //
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确");
                break;
            }else{
                System.out.println("您输入的邮箱格式不正确");
            }
        }
    }
}
