package com.weei.pkg.arraylist;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个arraylist集合对象
        ArrayList list = new ArrayList();

        //1、将指定的元素添加到此集合的末尾
        list.add("heima");
        list.add("666");
        list.add(99.5);
        list.add('a');
        System.out.println(list);

        //创建集合的规范方式 ：泛型ArrayList<E>  ，E不支持基本数据类型，只支持引用数据类型
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("heima");
        list2.add("momo");
        list2.add("彼得");
        list2.add("heima");
//        list2.add(444); //会报错
        System.out.println(list2);

        //2、在集合中的某个索引位置处添加一个数据
        list.add(1, "MySQL");
        System.out.println(list);

        //3、根据索引获取集合中某个索引位置处的值
        String rs = list2.get(1);
        System.out.println(rs);

        //4、获取集合的大小（个数）
        System.out.println(list2.size());

        //5、根据索引删除集合中的某个元素值返回给我们
        String rs2 = list2.remove(1);
        System.out.println(list2);
        System.out.println(rs2);

        //6、直接删除某个元素值，成功返回true，反之false
        System.out.println(list2.remove("heima"));//如果集合中有多个，删除的是最前面的一个
        System.out.println(list2);

        //7、修改某个索引位置处的数据，修改后返回原来的值
        String rs3 = list2.set(1, "mama");
        System.out.println(rs3);
        System.out.println(list2);
    }
}
