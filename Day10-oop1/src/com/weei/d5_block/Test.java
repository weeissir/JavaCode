package com.weei.d5_block;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(); //加载类时就执行静态代码块
        Student s2 = new Student(); //在创建新对象不再执行
        System.out.println(Student.name);
        Student s3 = new Student("mmmm");

    }
}
