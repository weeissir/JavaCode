package com.weei.d5_abstract;

public class Test {
    public static void main(String[] args) {
        //掌握抽象类的好处
        Animal a = new cat();
        a.cry();
        Animal b = new dog();
        b.cry();
    }
}
