package com.weei.pkg;
import com.weei.pkg.itcast.Demo1;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1、同一个包下的程序，Test可以直接访问Demo
        Demo d = new Demo();
        d.print();

        //2、访问其他包下程序，需要导包
        Demo1 d1 = new Demo1();
        d1.print();

        //3、Javo.lang包下的程序是不需要我们导包的，可以直接使用
        Scanner sc = new Scanner(System.in);
        String s = "黑马";
        Random r = new Random();

        //访问多个同名程序时，默认只能导入一个，另一个必须带包名和类名访问
        com.weei.pkg.itcast2.Demo1 d2 = new com.weei.pkg.itcast2.Demo1();
        d2.print();

    }

}
