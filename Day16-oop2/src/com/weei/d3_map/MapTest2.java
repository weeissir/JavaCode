package com.weei.d3_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        /*
        * map集合的常用方法
        * */
        Map<String, Integer> map = new HashMap<>();  //经典代码 按照键 无序，不重复，五索引
//        Map<String, Integer> map = new LinkedHashMap<>();  //有序，不重复，五索引
        map.put("手表", 200);
        map.put("手表", 220); //后面重复的数据（键）会覆盖前面的数据（值）
        map.put("电脑", 2);
        map.put("手机", 2);
        map.put("Java", 666);
        map.put(null, null);
        System.out.println(map);
        //获取集合大小
        System.out.println(map.size());

        //清空集合
//        map.clear();
//        System.out.println(map);

        //判断是否清空 为空返回true
        System.out.println(map.isEmpty());

        //根据键获取对应值
        System.out.println(map.get("手表"));

        //根据键删除元素（返回值）
        System.out.println(map.remove("手表"));
        System.out.println(map);

        //判断是否包含某个键，包含返回true
        System.out.println(map.containsKey("java"));
        System.out.println(map.containsKey("Java"));  //精确匹配

        //判断是否包含某个值
        System.out.println(map.containsValue(2));  //true
        System.out.println(map.containsValue("2"));  //false

        //获取Map集合的全部键
        Set<String> keys =  map.keySet();
        System.out.println(keys);

        //把其他Map中的数据导入另一个集合
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("MySQL", 300);
        map2.put("电脑", 300);
        map2.put("java", 200);
        map.putAll(map2); //把map2集合中的元素拷贝一份到map中
        System.out.println(map);   //{null=null, Java=666, 电脑=300, 手机=2, java=200, MySQL=300}

    }
}
