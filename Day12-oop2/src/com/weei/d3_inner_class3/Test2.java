package com.weei.d3_inner_class3;

public class Test2 {
    //掌握匿名内部类的常见使用场景
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("猫🏊‍一般");
            }
        };
        go(s1);
        //匿名内部类直接作为参数传给方法
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("狗🏊‍飞快");
            }
        });
    }



    //设计一个方法，可以接受swimming接口的一切实现类对象
    public static void go(Swimming s){
        System.out.println("开始------");
        s.swim();
    }
}


//猫和狗都要参加游泳比赛，设计一个接口
interface Swimming{
    void swim();
}


