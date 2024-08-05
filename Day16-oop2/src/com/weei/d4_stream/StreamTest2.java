package com.weei.d4_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamTest2 {
    public static void main(String[] args) {
        /*
        * 掌握Stream流中间方法
        * */
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 45.5, 98.5, 88.2, 56.7, 60.0);
        //1、找出成绩大于等于60的数据，并升序，输出
        scores.stream().filter(e -> e >= 60).sorted().forEach(c -> System.out.println(c));
    }
}
