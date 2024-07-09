package com.weei.object.encapsulation;

public class Test {
    public static void main(String[] args) {
        //目标：掌握封装的设计规范：合理隐藏，合理暴露
        Student s1 = new Student();
        s1.setScore(167);
        System.out.println("成绩是：" +s1.getScore());
    }
}
