package com.weei.d1_collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
    public static void main(String[] args) {
        /*
        * 需求：展示多部电影
        * */
        //创建一个集合容器负责存储多部电影对象
        Collection<Movie> movies = new ArrayList<>();
        movies.add(new Movie("《肖生克的救赎》", 9.6, "罗宾斯"));
        movies.add(new Movie("《霸王别姬》", 9.6, "罗宾斯"));
        movies.add(new Movie("《阿甘正传》", 9.5, "汤姆汉克斯"));

        for (Movie movie : movies) {
            System.out.println("电影：" + movie.getName());
            System.out.println("评分：" + movie.getScore());
            System.out.println("主演：" + movie.getActor());
            System.out.println("----------------");
        }

    }
}
