package com.weei.d9_modifer;

public class Fu {
    //only：本类
    private void privateMethod(){
        System.out.println("===private===");
    }

    //本类、同一个包下的类
    void method(){
        System.out.println("==缺省==");
    }

    //本类、同一个包下的类、任意包下的子类
    protected void protectedMethod(){
        System.out.println("==protected==");
    }

    //本类、同一个包下的类、任意包下的子类、任意包下的任意类
    public void publicMethod(){
        System.out.println("==public==");
    }

    public void test(){
        //在本类下全部权限都可访问
        privateMethod();
        protectedMethod();
        publicMethod();
        method();
    }
}