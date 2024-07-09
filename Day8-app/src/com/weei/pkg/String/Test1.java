package com.weei.pkg.String;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //1、开发一个登录界面
        for (int i =0; i < 3; i++)
        //最多尝试三次
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入登录名称");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            //5、调用登录方法，判断是否成功
            boolean rs = login(name, password);
            if(rs){
                System.out.println("登陆成功");
                break;//跳出for循环，代表登陆成功
            }else {
                System.out.println("账号或密码错误");
            }
        }

    }

    //2、开发一个登录方法，接收用户的登录名和密码，返回认证的结果
    public static boolean login(String name, String password){
        //3、准备一份正确的账户信息
        String okname = "itheima";
        String okpassword = "123456";

        //4、开始正式判断用户是否登录成功
        //比较字符串内容是否相等要用equals();
        /*if(okname.equals(name) && okpassword.equals(password)){
            //登录成功
            return true;
        }else {
            return false;
        }*/
        //一行代码即可简化上述过程
        return okname.equals(name) && okpassword.equals(password);
    }
}
