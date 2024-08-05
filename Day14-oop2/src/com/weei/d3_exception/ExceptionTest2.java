package com.weei.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest2 {
    /*
    * 目标：异常的处理
    * */
    public static void main(String[] args) {
        try {
            test1();
        } catch (ParseException e) {
            System.out.println("您要解析的时间有问题");
            e.printStackTrace();  //打印处这个异常对象的信息，记录下来
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在");
            e.printStackTrace();
        }
    }
    //再次上抛
    public static void test1() throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24:30");
        System.out.println(d);
        test2();
    }
    //抛给调用者
    public static void test2() throws FileNotFoundException {
        //读取文件
        InputStream is = new FileInputStream("C:/Users/HP/Desktop/1.png");
    }
}
