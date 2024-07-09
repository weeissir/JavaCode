package com.weei.d7_interface_demo;

import java.util.ArrayList;

public class Classmanager {
    private ArrayList<Student> students = new ArrayList<>();//null
    //面向接口编程，调用不同的实现类 （一种多态的写法）
    private StudentOperator studentOperator = new StudentOperatorImpl2();


    public Classmanager(){
        students.add(new Student("张三" , '男', 79));
        students.add(new Student("李四" , '男', 99.5));
        students.add(new Student("李小兰" , '女', 69));
        students.add(new Student("张小花" , '女', 99)); //ctrl+D复制并在下一行输出



    }

    //打印全班全部学生的信息
    public void printinfo(){
        studentOperator.printAllinfo(students);
    }

    //打印全部学生平均分
    public void printScore(){
        studentOperator.printAvgScore(students);
    }
}
