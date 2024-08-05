package com.weei.d3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/*
* Map的遍历方式
* */
public class MapTest3 {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();
        map.put("张三", 167.5);
        map.put("王明", 198.8);
        map.put("小张", 162.1);
        map.put("老李", 177.5);
        System.out.println(map);

        /*01 键找值*/
        //1、获取全部键
        Set<String> keys = map.keySet();   //alt+enter快速创建变量
        System.out.println(keys);

        //2、遍历全部的键
        for (String key: keys) {
            double value = map.get(key);
            System.out.println(key + "--->" + value);
        }

        /*02 键值对*/
        //1、调用entrySet方法，把Map集合转换成键值对类型的Set集合
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "-----》" + value);
        }

        /*03Lambda表达式 【推荐，简洁】*/
        map.forEach((k, v) -> {
            System.out.println(k + "--->" + v);
        });

/*        map.forEach(new BiConsumer<String, Double>() {
            @Override
            public void accept(String k, Double v) {
                System.out.println(k + "------>"  + v);
            }
        });*/
    }
}
