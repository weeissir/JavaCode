package com.weei.api.d6_jdk8time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test1_LocalDate {
    public static void main(String[] args) {
        //1、获取本地日期对象（不可变对象）
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        //2、获取日期对象中的信息
        int year = ld.getYear();
        int month = ld.getMonthValue(); //1-12月
        int day = ld.getDayOfMonth(); //日
        int dayofyear = ld.getDayOfYear(); //一年中的第几天
        int dayofweek = ld.getDayOfWeek().getValue();//星期几
        System.out.println(dayofweek);
        DayOfWeek week = ld.getDayOfWeek();
        System.out.println(week);

        //3、直接修改某个信息（每次修改会返回一个新对象）
        LocalDate ld2 = ld.withYear(2030);
        LocalDate ld3 = ld.withMonth(9);
        System.out.println(ld2);
        System.out.println(ld);
        //4、把某个信息加减
        System.out.println(ld2.plusDays(23));
        System.out.println(ld3.minusMonths(5));
        //5、获取指定日期的LocalDate对象
        LocalDate ld4 = LocalDate.of(2080, 12, 20);
        LocalDate ld5 = LocalDate.of(2080, 12, 22);
        System.out.println(ld4);
        //6、判断2个日期对象是否相等，以及前后
        System.out.println(ld4.equals(ld5));
        System.out.println(ld4.isAfter(ld5));
        System.out.println(ld4.isBefore(ld5));

        //Localtime和LocalDatetime用法相似
        LocalTime it = LocalTime.now();
        System.out.println(it);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        LocalDate ldd = ldt.toLocalDate();
        LocalTime ltt = ldt.toLocalTime();
        LocalDateTime ldt2 = LocalDateTime.of(ldd, ltt);
        System.out.println(ldt2);
    }
}
