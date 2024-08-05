package com.weei.d4_stream;

import java.util.*;
import java.util.stream.Stream;

/*
* Stream流的常用方法
* */
public class StreamTest1 {
    public static void main(String[] args) {
        //1、获取List集合的Stream流
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四", "王五", "张小六", "张强");
        Stream<String> stream = names.stream();

        //2、获取Set集合的Stream流
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "小德", "张三丰", "李书福");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));

        //3、获取Map集合的Stream流
        Map<String, Double> map = new HashMap<>();
        map.put("张三", 284.4);
        map.put("小明", 124.4);
        map.put("小张", 244.4);
        map.put("王柳", 25.6);

        Set<String> keys = map.keySet();
        Stream<String> ks = keys.stream();

        Collection<Double> values = map.values();
        Stream<Double> vs = values.stream();

        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> kvs = entries.stream();
        kvs.filter(s -> s.getKey().contains("张")).forEach(e -> System.out.println(e.getKey() + "---->" + e.getValue()));

        //4、获取数组的Stream流
        String[] names2 = {"张小花", "刘大山", "李芳芳", "糖衣"};
        Stream<String> stream2 = Arrays.stream(names2);
        Stream<String> s1 = Stream.of(names2);
    }
}
