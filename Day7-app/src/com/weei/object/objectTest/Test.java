package com.weei.object.objectTest;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //1、设计一个电影类
        //2、设计一个电影操作类
        //3、准备 全部电影数据
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1,"水门桥",9.8,"徐克","吴京","12万人想看");
        movies[1] = new Movie(2,"出拳吧",7.8,"唐晓白","田雨","3.5万人想看");
        movies[2] = new Movie(3,"月球陨落",7.9,"罗兰","贝瑞","17.9万人想看");
        movies[3] = new Movie(4,"一点就到家",8.7,"许宏宇","刘吴然","10.8万人想看");
        movieoperator op = new movieoperator(movies);
//        op.printMovies();
//        op.searchMovies(2);
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请选择以下编号进入功能：");
            System.out.println("1、展示所有电影信息");
            System.out.println("2、根据id查询电影信息");
            int fo = sc.nextInt();
            switch (fo){
                case 1 :
                    op.printMovies();
                    break;
                case 2 :
                    System.out.println("请输入电影编号：");
                    int id = sc.nextInt();
                    op.searchMovies(id);
                    break;
                default:
                    System.out.println("输入的编号不存在");
            }
        }
    }
}
//1,"水门桥",9.8,"徐克","吴京","12万人想看"
// 2，"出拳吧",7.8,"唐晓白","田雨","3.5万人想看"
// 3,"月球陨落",7.9,"罗兰","贝瑞","17.9万人想看"
// 4,"一点就到家",8.7,"许宏宇","刘吴然","10.8万人想看"