package com.weei.d1_inner_class1;

public class Outer {
    private int age = 100;
    public static String a;

    //成员内部类
    public class Inner{
        private String name;
        public static String schoolname; //JDK16开始支持定义静态成员
        private int age = 66;
        public void test(){
            //内部类属于外部类成员，因此可以直接访问外部类的成员
            int age = 88;
            System.out.println(age); //就近原则 88
            System.out.println(this.age); //当前内部类 66
            System.out.println(Outer.this.age); //指定外部类 100
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
