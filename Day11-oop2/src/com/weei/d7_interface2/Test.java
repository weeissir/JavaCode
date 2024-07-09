package com.weei.d7_interface2;

public class Test {
    public static void main(String[] args) {
        //搞清楚使用接口的好处
        //1、弥补单继承的不足
        Student s = new A();
        s.print();  //当学生类使用学生的方法
        Driver d = new A();
        Singer g = new A();
        g.sing();
        d.drive();  //当司机类使用司机的方法

        //面向接口编程
        Driver dd = new A(); //可以灵活更换实现类，实现操作对象的更改
//        Driver dd = new B();
        dd.drive(); //用接口调用方法

    }
}

//一个接口可以被多个类实现
class B implements Driver{
    @Override
    public void drive() {

    }
}

//一个类实现多个接口
class A extends Student implements Driver, Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

class Student{
    void print(){

    }
}

interface Driver{
    void drive();
}

interface Singer{
    void sing();

}
