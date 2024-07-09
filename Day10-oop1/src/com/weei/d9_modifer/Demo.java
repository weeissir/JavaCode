package com.weei.d9_modifer;

public class Demo {
    //掌握不同权限修饰符的作用
    public static void main(String[] args) {
        Fu f = new Fu();
        f.method();
        f.publicMethod();
        f.protectedMethod();
    }
}
