package com.weei.d7_generics_class;

//定义一个泛型类
public class Myarraylist<E> {
    private Object[] arr = new Object[10];
    private int size; //记录当前位置

    //模拟集合的add功能
    public boolean add(E e){
        arr[size++] = e;
        return true;
    }

    //模拟集合的get功能
    public E get(int index){

        return (E) arr[index];
    }
}
