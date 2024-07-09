package com.weei.d12_extends_override;

public class Test {
    public static void main(String[] args) {
        //掌握方法重写的应用场景
        B b  = new B();
        //重写后调用重写的
        b.print();
        b.print2(2, 3);

        System.out.println("-------");

        Student s = new Student("momo", 19);
//        System.out.println(s.toString());//默认调用了Object类中的toString方法返回对象的地址
        System.out.println(s); //Student{name='momo', age=19}

    }
}
