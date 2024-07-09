package com.weei.api.d1_api_object;

import java.util.Objects;

public class Student {//extends Object 默认继承
    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法，比较两个对象的内容
    //比较者：s2； 被比较者：s1；this == s2
    @Override
    public boolean equals(Object o) { //s1 == o
        if (this == o) return true; //判断s1和s2地址是否一样
        //o ==null时直接返回false，或者比较对象的类型不一样也直接返回false
        //eg. Student.Class != Pig.Class;
        if (o == null || getClass() != o.getClass()) return false;
        //正式开始比较内容，此时o一定是学生类型的对象，需要先从object类强转成Student类
        Student student = (Student) o;
        return this.age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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
}
