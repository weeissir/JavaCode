package com.weei.d7_generics_class;

public class Test {
    public static void main(String[] args) {
        //目标：掌握泛型类的定义和使用
         Myarraylist<String> list = new Myarraylist<>();
         list.add("momo1");
         list.add("hdhd");
         String ee = list.get(1);
         System.out.println(ee);

         Myclass<String, String> c = new Myclass<>();

         Myclass2<Animal> f = new Myclass2<>();
         Myclass2<Dog> d = new Myclass2<>();
    }
}
