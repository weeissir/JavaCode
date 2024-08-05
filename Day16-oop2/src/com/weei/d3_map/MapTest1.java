package com.weei.d3_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
* 掌握Map集合的特点
* */
public class MapTest1 {
    public static void main(String[] args) {
//        Map<String, Integer> map = new HashMap<>();  //经典代码 按照键 无序，不重复，五索引
        Map<String, Integer> map = new LinkedHashMap<>();  //有序，不重复，五索引
        map.put("手表", 200);
        map.put("手表", 220); //后面重复的数据（键）会覆盖前面的数据（值）
        map.put("电脑", 2);
        map.put("手机", 2);
        map.put(null, null);
        System.out.println(map);

        Map<Integer, String> map1 = new TreeMap<>(); //可排序（按照键值），不重复，无索引
        map1.put(23, "java");
        map1.put(20, "MySql");
        map1.put(19, "张三");
        System.out.println(map1);

    }
}
