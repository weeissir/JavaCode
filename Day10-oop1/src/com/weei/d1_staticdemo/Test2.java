package com.weei.d1_staticdemo;

public class Test2 {
    //通过案例理解类变量的应用场景
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();

        System.out.println(User.number);  //每创建一个新对象，共用同一个类变量number（访问、修改）
    }
}
