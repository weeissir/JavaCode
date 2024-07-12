package com.weei.api.d6_jdk8time;

import java.time.*;

public class Test2_ZoneId_DataTime {
    public static void main(String[] args) {
        //1、ZoneId的常见用法
        //获取系统默认时区
        ZoneId id = ZoneId.systemDefault();
        System.out.println(id);
        System.out.println(id.getId());

        //获取java支持的全部时区id
        System.out.println(ZoneId.getAvailableZoneIds());

        //把某个时区id封装成ZoneId对象
        ZoneId id1 = ZoneId.of("America/Marigot");

        //ZoneDateTime：带时区的时间
        //获取某个时区的ZoneDateTime对象
        ZonedDateTime now = ZonedDateTime.now(id1);
        System.out.println(now);

        //获取系统默认时区对象
        System.out.println(ZonedDateTime.now());

        //获取世界标准时间
        System.out.println(ZonedDateTime.now(Clock.systemUTC()));

        //常见方法与LocalDataTime相似

        //Duration用法
        LocalDateTime s1 = LocalDateTime.of(2024, 4, 24, 11, 10, 10);
        LocalDateTime s2 = LocalDateTime.of(2024, 11, 22, 11, 10, 10);
        Duration d = Duration.between(s1, s2);

        //获取两个时间对象的间隔时间
        System.out.println(d.toDays());
        System.out.println(d.toHours());
        System.out.println(d.toMinutes());
        System.out.println(d.toSeconds());
        System.out.println(d.toNanos());



    }
}
