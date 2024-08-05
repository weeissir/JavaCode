package com.weei.d1_collection;

import java.util.*;

public class CollectionTest1 {
    //认识collection集合特点
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//有序 可重复有索引
        list.add("java1");
        list.add("java2");
        list.add("java1");
        list.add("java3");
        System.out.println(list);

        Set<String> set = new HashSet<>();//无序 不重复 无索引
        set.add("java1");
        set.add("java2");
        set.add("java1");
        set.add("java3");
        System.out.println(set);

        Collection<String> c = new ArrayList<>(); //多态写法：接口new一个实现类
        //clear 清空
        c.add("java1");
        c.add("java3");
        c.add("java2");
        c.add("java1");
//        c.clear();
        System.out.println();

        //isEmpty 判断是否为空
        System.out.println(c.isEmpty());

        //获取集合大小
        System.out.println(c.size());

        //contains 判断是否包含某个元素
        System.out.println(c.contains("java1"));

        //删除某个元素，如果有重复的，删除前面的第一个
        System.out.println(c.remove("java1"));
        System.out.println(c);

        //集合转换成数组
        Object[] arr = c.toArray();
        System.out.println(Arrays.toString(arr));

        //把一个集合倒入另一个集合
        Collection<String> c2 = new ArrayList<>();
        c2.add("java2");
        c2.add("java5");
        c.addAll(c2); //把c2添加到c中，c2中的保持不变
        System.out.println(c);
    }

}
