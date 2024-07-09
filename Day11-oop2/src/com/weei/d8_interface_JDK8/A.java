package com.weei.d8_interface_JDK8;

public interface A {
    /*
    * 1、默认方法：必须使用default修饰，默认会被public修饰
    * 实例方法：对象的方法，必须使用实现类的对象来访问
    *  */
    public default void test1(){ //public可以省略
        System.out.println("默认方法");
        test2(); //私有方法只能在此类中访问
    }

    /*
    * 2、私有方法：必须用private修饰（JDK9开始支持）
    * 实例方法：对象的方法，必须用当前接口名调用
    * */
    private void test2(){
        System.out.println("==私有方法==");
    }

    /*
    * 3、静态方法：必须使用static修饰，默认使用public修饰
    * */
    public static void test3(){
        System.out.println("==静态方法==");
    }
}
