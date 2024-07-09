package com.weei.d7_interface_demo;

import java.util.ArrayList;

//第二套方案实现类
public class StudentOperatorImpl2 implements StudentOperator{
    @Override
    public void printAllinfo(ArrayList<Student> students) {
        System.out.println("----全班信息如下------");
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < students.size(); i++) {
            Student s  = students.get(i);
            System.out.println("姓名：" + s.getName() + "，性别：" + s.getSex() + "，成绩：" + s.getScore());
            if(s.getSex() == '男'){
                count1++;
            }else {
                count2++;
            }
        }
        System.out.println("男生人数：" + count1 + "，女生人数：" + count2);
        System.out.println("班级总人数：" + students.size());
        System.out.println("-----------");
    }

    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double allscore = 0.0;
        double max = students.get(0).getScore();
        double min = students.get(0).getScore();
        for (int i = 1; i < students.size(); i++) {
            Student s  = students.get(i);
            if(s.getScore() > max) max = s.getScore();
            if(s.getScore() < min) min = s.getScore();
            allscore += s.getScore();
        }
        System.out.println("学生的最高分：" + max + "学生的最低分：" + min);
        double avgscore = (allscore - max - min ) / (students.size() - 2);
        System.out.println("平均分：" + avgscore);
    }
}
