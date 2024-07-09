package com.weei.d9_interface_attention;

public class Test {
    public static void main(String[] args) {
        //理解接口的多继承
    }
}

interface A{
    void test1();
}
interface B{
    void test2();
}

interface C{
    void tets3();
}

//接口是多继承的
interface D extends A, B, C{

}

//定义一个实现类
class E implements D{
    //通过实现D接口，达到实现ABC全部接口的目的
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void tets3() {

    }

}
