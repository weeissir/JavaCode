package com.weei.object.quickstart;

public class Student {
    String name;
    double chinese;
    double math;

    public void printscore(){
        System.out.println(name + "的总成绩： " + (chinese + math));
    }

    public void computescore(){
        System.out.println(name + "的平均成绩：" + (chinese + math) /2.0);
    }
}
