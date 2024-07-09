package com.weei.d14_extends_constructor;

public class Test3 {
    public static void main(String[] args) {
        //掌握在类的构造器中，通过this(...)调用兄弟构造器的作用
        Student s1 = new Student("momo", 24, "pku");

        //需求：如果学生没有填写学校，默认学校scu
        Student s2 = new Student("momo", 19);
        System.out.println(s2.getSchool());
        System.out.println(s1.getSchool());
    }
}

class Student{
    private String name;
    private int age;
    private String school;

    public Student() {
    }

    public Student(String name, int age){
//        this.age = age;
//        this.name = name;
//        this.school = "scu";  //与下面的构造器几乎相同，用this()直接调用
        this(name, age, "scu");
//        super();//this()和super()不能同时出现，而且都要是第一行
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}