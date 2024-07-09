package com.weei.d6_singleInstance;

public class B {
    //1、把构造器私有
    private B(){

    }

    //2、定义一个类变量
    private static B b;

    //3、定义一个类方法，保证第一次调用时创建一个对象，后面调用都用这个对象返回
    public static B getInstance(){
        if(b == null){
            System.out.println("创建对象");
            b = new B();
        }

        return b;
    }
}
