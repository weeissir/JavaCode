package com.weei.method.overload;

public class methodTest {
    public static void main(String[] args) {
        fire();
        fire("Japan");
        fire("Japan", 3);
        chu(4, 0);
    }
//    开发武器系统，功能需求如下:
//    可以默认发一枚武器。
//    可以指定地区发射一枚武器
//    可以指定地区发射多枚武器
    public static void fire(){
        System.out.println("默认发射武器");
    }

    public static void fire(String country){
        System.out.println("发射了一枚武器给" + country) ;
    }

    public static void fire(String country, int num){
        System.out.println("发射了"+ num + "枚武器给" + country);
    }

    public static void chu(int a, int b){
        if(b == 0){
            System.out.println("分母不可以为0");
            return; //直接跳出并结束当前chu方法的执行
        }
        int c = a / b;
        System.out.println("结果为" + c);
    }
}
