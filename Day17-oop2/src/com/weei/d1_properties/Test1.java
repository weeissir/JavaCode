package com.weei.d1_properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

/*
* 掌握使用Properties类读取属性文件中的键值对信息
* */
public class Test1 {
    public static void main(String[] args) throws Exception {
        //1、创建一个properties对象
        Properties properties = new Properties();
        System.out.println(properties);

        //2、加载属性文件中的键值对到p对象中
        properties.load(new FileReader("Day17-oop2\\src\\users.properties"));
        System.out.println(properties);

        //3、根据键取值
        System.out.println(properties.getProperty("张三"));
    }
}
