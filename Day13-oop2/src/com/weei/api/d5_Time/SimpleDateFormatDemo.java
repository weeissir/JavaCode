package com.weei.api.d5_Time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //掌握SimpleDateFormat的使用
        //1、准备一些时间
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        //2、格式化日期对象，和时间 毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a"); //查看文档手册编号含义
        String rs = sdf.format(d);
        String rs2 = sdf.format(time);
        System.out.println(rs);
        System.out.println(rs2);
        System.out.println("----------------------------");

        //目标：解析字符串时间成为日期对象
        String datestr = "2024-4-20 21:35:00";
        //1、创建简单日期格式化对象，指定的时间格式必须与被解析的时间格式一模一样，否则程序会出bug
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date rs3 = sdf2.parse(datestr);
        System.out.println(rs3);

    }
}
