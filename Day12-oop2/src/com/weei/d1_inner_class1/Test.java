package com.weei.d1_inner_class1;

public class Test {
    public static void main(String[] args) {
        //了解成员内部类和特点
        //访问方式：外部类名.内部类名 = new 外部类.new 内部类名
        Outer.Inner in = new Outer().new Inner();
        in.test();
        in.getName();
    }


}
