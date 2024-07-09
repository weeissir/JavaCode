package com.weei.d3_final;

public class Test {
    /*
    常量：public static final修饰的成员变量，建议名称全部大写，多个单词下划线连接  ctrl+shift+U
    */
    public static final String SCHOOL_NAME = "pku"; //必须赋值，且只能赋值这一次
    public static void main(String[] args) {
        //认识final的作用
        //3、final修饰变量，总规则：有且只能赋值一次
/*        变量：
        一、局部变量
        二、成员变量
            1、静态
            2、实例 （少见）
            */
        final int a;
        a = 12;
//        a = 13; //第二次赋值，报错

        final double r = 3.14;
//        r = 0.1;

//        name = "hhh";//修饰静态变量，报错

        final int[] arr = {11,22,33};
//        arr = null;//改地址报错，算第二次赋值
        arr[1] = 222;//修饰引用变量改内容没问题
    }

    public static void buy(final double z){
//        z= 0.1; //只能接输入这一次值，不能被改变
    }

}

//1、final修饰类，类不能被继承了
final class A{}
//class B extends A{} //不能再被继承，例如一些工具类

//2、final修饰方法，方法不能被重写
class C{
    public final void test(){

    }
}

class D extends C{
//    @Override
//    public void test() {
//        super.test();
//    } //报错
}