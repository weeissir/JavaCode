package com.weei.d7_interface_demo;

import java.util.ArrayList;

//第一种方案实现类
public class StundentOperatorImpl1 implements StudentOperator{

    @Override
    public void printAllinfo(ArrayList<Student> students) {
        System.out.println("----全班信息如下------");
        for (int i = 0; i < students.size(); i++) {
            Student s  = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
        }
        System.out.println("-----------");
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allscore = 0.0;
        for (int i = 0; i < students.size(); i++) {
            Student s  = students.get(i);
            allscore += s.getScore();
        }
        double avgscore = allscore / students.size();
        System.out.println("平均分：" + avgscore);
    }
}
