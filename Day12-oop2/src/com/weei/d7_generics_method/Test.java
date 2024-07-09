package com.weei.d7_generics_method;

import com.weei.d7_generics_class.Dog;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //掌握泛型方法的定义和使用
        System.out.println(test("java"));

        Dog d = test(new Dog());
        System.out.println(d);

        //需求：所有汽车一起参加比赛
        ArrayList<Car>  cars = new ArrayList<>();
        cars.add(new BWM());
        cars.add(new BENZ());
        go(cars);

        ArrayList<BWM> bwms = new ArrayList<>();
        bwms.add(new BWM());
        bwms.add(new BWM());
        go(bwms);

/*        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        go(dogs);*/  //定义泛型方式时加上继承限定，排除无关类

    }
    //定义泛型方法
    //<T>先申明一个泛型变量
    public static <T> T test(T t){
        return t;
    }


    //通配符：？，在使用泛型的时候可以代表一切类型  ? extends Car（上限）? super Car（下限，只能是Car或Car的父类）
      public static void go(ArrayList<? extends Car> cars){

      }

      //E T K V是在定义泛型的时候使用
/*    public static <T extends Car> void go(ArrayList<T> cars){

    }*/
}
