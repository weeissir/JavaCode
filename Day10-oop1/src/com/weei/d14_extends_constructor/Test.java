package com.weei.d14_extends_constructor;

public class Test {
    public static void main(String[] args) {
        //目标：认识子类构造器的特点，掌握这个特点的常见应用场景
        Z z = new Z();
        System.out.println("-------");
        Z z2 = new Z("momo");

    }
}


class F{
//    public F(){
//        System.out.println("===父类的无参构造器执行了===");
//    }

    public F(String name){
        System.out.println("===父类的有参构造器执行了===");
    }
}

class Z extends F{
    public Z(){
//        super(); //默认存在的可以不写，访问父类的无参构造器
        super("momo"); //如果父类没有无参构造器必须手写super调用父类的有参构造器
        System.out.println("子类的无参构造器执行了");
    }
    public Z(String name){
//        super(); //默认存在的，不用写
        super("momo");
        System.out.println("子类的有参构造器执行了");
    }
}