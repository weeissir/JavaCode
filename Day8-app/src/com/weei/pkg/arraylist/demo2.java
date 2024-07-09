package com.weei.pkg.arraylist;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
//        需求：假如购物车中存储了如下这些商品:
//        Java入门，宁夏杞，黑杞，人字拖，特级构杞，构杞子。
//        现在用户不想买构杞了，选择了批量删除，请完成该需求。

        //1、创建一个Arraylist集合对象
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        //2、从集合中找到包含枸杞的数据并删除
/*        for (int i = 0; i < list.size(); i++) {
            // 取出当前遍历到的数据
            String ele = list.get(i);
            //判断数据是否包含枸杞
            if(ele.contains("枸杞")){
                //删除该数据
                list.remove(ele);
            }
        } //结果：[Java入门, 黑枸杞, 人字拖, 枸杞子]
        //以上代码存在bug，remove之后会导致数据的索引前移，漏掉某些元素的判断
        System.out.println(list);*/

        //方式1：每次删除一个数据，就让i向前退一步
/*        for (int i = 0; i < list.size(); i++) {
            // 取出当前遍历到的数据
            String ele = list.get(i);
            //判断数据是否包含枸杞
            if(ele.contains("枸杞")){
                //删除该数据
                list.remove(ele);
                i--;
            }
        } //结果：[Java入门, 人字拖]
        System.out.println(list);*/

        //方式2：从集合的后面倒着遍历并删除
        for (int i = list.size() - 1; i >= 0 ; i--) {
            // 取出当前遍历到的数据
            String ele = list.get(i);
            //判断数据是否包含枸杞
            if(ele.contains("枸杞")){
                //删除该数据
                list.remove(ele);
            }
        } //结果：[Java入门,人字拖]
        System.out.println(list);
    }
}
