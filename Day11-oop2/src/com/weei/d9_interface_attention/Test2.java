package com.weei.d9_interface_attention;

public class Test2 {
    public static void main(String[] args) {
        //了解使用接口的几点注意事项
        //3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先使用父类的
        Zi z= new Zi();
        z.run(); //父类的run
        //4、一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
        N n = new N();
        n.test(); //自己的
    }
}

//1、一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承
interface I{
    void test();
}
interface J{
    String test();
}
/*interface K extends I, J{

} //报错*/

//2、一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现
/*class E implements I, J{

} //报错*/

//3、一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先使用父类的
class Fu{
    public void run(){
        System.out.println("父类的run执行了");
    }
}
interface IT{
    default void run(){
        System.out.println("接口的run执行了");
    }
}
class Zi extends Fu implements IT{

}

//4、一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可
interface it1{
    default void test(){
        System.out.println("it1");
    }
}
interface it2{
    default void test(){
        System.out.println("it2");
    }
}

class N implements it1, it2{

    @Override
    public void test() {
        System.out.println("自己的");
    }
}


