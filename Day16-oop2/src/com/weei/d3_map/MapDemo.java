package com.weei.d3_map;

import java.util.*;

/*
* 完成Map集合案例：统计投票人数
* */
public class MapDemo {
    public static void main(String[] args) {
        //1、把80个学生选择的景点数据拿到程序中
        List<String> data = new ArrayList<>();
        String[] selects = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(4); //0 1 2 3
            data.add(selects[index]);
        }
        System.out.println(data);
        //2、统计每个景点的人数
        //准备一个Map集合
        Map<String, Integer> result = new HashMap<>();

        //3、遍历80个景点数据
        for (String s : data) {
            if (result.containsKey(s)){
                //当前景点数值+1
                result.put(s, result.get(s) + 1);
            }else {
                //第一次统计，数量记作1
                result.put(s, 1);
            }
        }
        System.out.println(result);
    }
}
