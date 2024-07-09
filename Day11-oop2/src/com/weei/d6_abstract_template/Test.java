package com.weei.d6_abstract_template;

public class Test {
    public static void main(String[] args) {
        //搞清楚抽象类的应用场景之一：设计模板方法设计模式
        //场景：学生，老师都要写一篇作文
        //正文自由发挥，第一段和最后一段相同
        Teacher t = new Teacher();
        t.write();
        Student s = new Student();
        s.write();

    }
}
