package com.weei.object.javabean;

public class Student {
//   1、 这个类中的成员变量都要私有，并且要对外提供相应的get set方法
    private String name;
    private double score;

//    2、类中必须要有一个公共的无参的构造器。

    //快速创建：右键选择generate中constructor
    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    //快速创建：右键选择generate中getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
