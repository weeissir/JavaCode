package com.weei.d2_polymorphism;

public class Test {
    public static void main(String[] args) {
        //目标：理解多态的好处
        //1、可以实现解耦合，右边对象可以随时切换，后续业务随时改变
        People p1 = new Teacher();
        People p2 = new Student();
        p1.run();
        //2、可以使用父类类型的变量作为形参，可以接受一切子类对象
        Student s = new Student();
        Teacher t = new Teacher();
        go(s);
        go(t);

        //3、多态的问题：无法调用子类的独有功能
//        p2.test();//报错
        //4、解决方法：强制类型转换
        Student s1 = (Student) p2;
        s1.test();

        //强制类型转换可能存在的问题:编译阶段有继续或者实现关系就可以强制转换，但是运行时可能出现类型转换异常
//        Teacher t1 = (Teacher) p2;//报错：java.lang.ClassCastException
        if(p2 instanceof Student){
            Student s2 = (Student) p2;
            s2.test();
        }else if(p2 instanceof Teacher){
            Teacher t2 = (Teacher) p2;
            t2.teach();
        }
    }
    //2、可以使用父类类型的变量作为形参，可以接受一切子类对象
    public static void go(People p){
    }


}
