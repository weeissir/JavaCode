package com.weei.d4_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四","张强", "王晓张", "张小兰");
        System.out.println(names);

        //找出姓张，三个字的名字，存入新集合
        /*01传统方法*/
        List<String> list = new ArrayList<>();
        for (String name : names) {
            if(name.startsWith("张") && name.length() == 3){
                list.add(name);
            }
        }
        System.out.println(list);

        /*02Stream流的方式*/
        List<String> list2 = names.stream().filter(s -> s.startsWith("张"))
                .filter(a -> a.length() == 3).collect(Collectors.toList());  //链式编程
        System.out.println(list2);
    }
}
