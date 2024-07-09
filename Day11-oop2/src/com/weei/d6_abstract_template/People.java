package com.weei.d6_abstract_template;

public  abstract class People {
    /*
    设计模板方法设计模式
    1、定义一个模板方法出来
    * */
    public final void write() {//final修饰，防止模板方法被重写
        System.out.println("\t\t\t\t\t《读者》");
        //2、模板方法只知道子类一定要重写
        System.out.println(writeMain());
        System.out.println("结尾：一样的");
    }

    //3、设计一个抽象方法写正文，具体实现交给子类重写
    public abstract String writeMain();

}

