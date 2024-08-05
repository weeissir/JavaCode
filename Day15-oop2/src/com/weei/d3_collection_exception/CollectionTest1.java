package com.weei.d3_collection_exception;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest1 {
    public static void main(String[] args) {
        //理解集合的并发修改异常问题，并解决
        ArrayList<String> list = new ArrayList<>();
        list.add("小李");
        list.add("张小花");
        list.add("王小李");
        list.add("张华");
        list.add("李玉");
        System.out.println(list);
        //删除集合中所有带“李”的名字
        //1、使用for循环
/*        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(name.contains("李")){
                list.remove(name);
                i--;
            }
        }
        System.out.println(list);*/

        //2、使用迭代器遍历
/*        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            if(name.contains("李")){
//                list.remove(name); //并发修改异常问题
                it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
            }
        }
        System.out.println(list);*/

        //3、使用增强for循环遍历集合并删除数据，无法解决并发修改异常bug
/*        for(String name : list){
            if(name.contains("李")){
                list.remove(name);
            }
        }
        System.out.println(list);*/

        //4、使用lambda表达式遍历集合并删除数据，无法解决并发修改异常bug
        list.forEach(name ->{
            if(name.contains("李")){
                list.remove(name);
            }
        });
        System.out.println(list);
    }
}
