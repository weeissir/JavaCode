package com.weei.d7_interface_demo;

import java.util.ArrayList;

//定义一个管理系统展示方式的接口
public interface StudentOperator {
    void printAllinfo(ArrayList<Student> students);
    void printAvgScore(ArrayList<Student> students);

}
