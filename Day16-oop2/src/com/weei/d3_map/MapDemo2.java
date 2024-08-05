package com.weei.d3_map;

import java.util.*;

/*
* 理解集合的嵌套
* */
public class MapDemo2 {
    public static void main(String[] args) {
        //1、定义一个Map集合存储全部的省分信息，和对应的城市信息
        Map<String, List<String>> map = new HashMap<>();
        List<String> cities1 = new ArrayList<>();
        Collections.addAll(cities1,"南京市", "扬州市", "苏州市", "无锡市", "常州市");
        map.put("江苏省", cities1);
        System.out.println(map);

        List<String> cities2 = new ArrayList<>();
        Collections.addAll(cities2,"武汉市","孝感市","十堰市", "宜昌市","鄂州市");
        map.put("湖北省", cities2);
        System.out.println(map);

        List<String> cities3 = new ArrayList<>();
        Collections.addAll(cities3,"石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        map.put("河北省", cities3);
        System.out.println(map);

        List<String> cities = map.get("湖北省");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
