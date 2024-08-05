package com.weei.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        * 掌握使用迭代器Iterator遍历
        * */
        Collection<String> c = new ArrayList<>();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("张思");

        //使用迭代器遍历
        //1、从集合对象获取迭代器对象
        Iterator<String> it = c.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        //越界会报错

        //2、使用循环
        while (it.hasNext()){
            String ele = it.next();
            System.out.println(ele);
        }

    }

}
