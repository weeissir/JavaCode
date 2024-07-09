package com.weei.object.javabean;

public class Test {
    public static void main(String[] args) {
        //掌握实体类的书写要求、特点、应用场景
        Student s = new Student();
        s.setName("zang三");
        s.setScore(78);
        System.out.println(s.getName());
        StudentOperator ss = new StudentOperator(s);
        ss.printPass();


    }
}
