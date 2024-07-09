package com.weei.d2_inner_class2;

public class Outer {
    private int age = 100;
    public static String school;

    //静态内部类
    public static class Inner{
        private int name;
        public static String a;

        public void test(){
            //可以直接访问外部类的静态成员
            System.out.println(school);
            //实例成员要用外部类的对象来访问
//            System.out.println(o.age);

        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }
    }
}
