package com.weei.d3_inner_class3;

public class Test {
    public static void main(String[] args) {
        //认识匿名内部类，掌握其作用
        //1、把这个匿名内部类编译成一个子类，然后会立即创建一个子类对象出来
        Animal a = new Animal(){
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}
//定义一个父类抽象类
abstract class Animal{
    public abstract void cry();
}

//class cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}



