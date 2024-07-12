package com.weei.api.d5_Time;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //掌握calendar的使用
        //1、获取系统此刻时间对应的日历对象
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        //2、获取日历中的某个信息
        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        //3、拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        //4、拿到时间毫秒值
        long time = now.getTimeInMillis();
        System.out.println(time);

        //5、修改日历中的某个信息
        now.set(Calendar.MONTH, 7);//修改成8月
        now.set(Calendar.DAY_OF_WEEK, 5);
        System.out.println(now);

        //6、为某个信息增加或者减少
        now.add(Calendar.DAY_OF_YEAR, 100); //加一百天
        now.add(Calendar.YEAR, -2); //减2年
        System.out.println(now);
    }
}
