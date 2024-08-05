package com.weei.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo2 {
    public static void main(String[] args) {
        /*
        * 掌握Collection遍历方式二：增强for
        * */
        Collection<String> c = new ArrayList<>();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("张思");

        for (String ele: c){  //c.for快捷键
            System.out.println(ele);
        }
        //本质上是在调用Iterator

        String[] names = {"jsjf", "momo", "张三"};
        for(String name : names){
            System.out.println(name);
        }

        //使用lambda表达式
/*        c.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        c.forEach((String s) -> {
                System.out.println(s);
        });

        c.forEach(s -> System.out.println(s));*/

        c.forEach(System.out::println);

    }
}
