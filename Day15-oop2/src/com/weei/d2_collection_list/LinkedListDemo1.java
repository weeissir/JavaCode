package com.weei.d2_collection_list;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        //1、创建一个队列  【队尾加入】
        LinkedList<String> queue = new LinkedList<>();
        queue.addLast("第1个人");
        queue.addLast("第2个人");
        queue.addLast("第3个人");
        queue.addLast("第4个人");
        System.out.println(queue);
        //2、出队  【从头退出】
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("------------------------");
        //3、创建一个栈对象
        LinkedList<String> stack = new LinkedList<>();
        //压栈（push）
        stack.addFirst("第1颗子弹");
        stack.addFirst("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");  //push封装的就是addFirst()方法
        System.out.println(stack);
        //出栈（pop）
        System.out.println(stack.removeFirst());
        System.out.println(stack.pop()); //同理
        System.out.println(stack);
    }

}
