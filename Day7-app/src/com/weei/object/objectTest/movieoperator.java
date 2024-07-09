package com.weei.object.objectTest;

public class movieoperator {
    private Movie[] movies;
    public movieoperator(Movie[] movies){
        this.movies = movies;
    }

    /*1、展示系统全部电影信息*/
    public void printMovies(){
        System.out.println("系统全部电影信息如下");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号："  + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("导演：" + m.getDirector());
            System.out.println("--------------------");
        }
    }

    /*2、根据电影的编号查询该电影的详细信息并展示*/
    public void searchMovies(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if(m.getId() == id){
                System.out.println("该电影详情如下：");
                System.out.println("编号："  + m.getId());
                System.out.println("名称：" + m.getName());
                System.out.println("得分：" + m.getScore());
                System.out.println("主演：" + m.getActor());
                System.out.println("导演：" + m.getDirector());
                System.out.println("其他信息：" + m.getInfo());
                System.out.println("--------------------");
                return;//已经找到了电影信息，没有必要再执行
                //用在无返回值的void方法中，作用是:立即跳出并结束当前方法的执行。
            }
        }
        System.out.println("没有该电影信息");
    }


}
