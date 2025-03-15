package com.itheima.movie;

import java.util.Scanner;

public class MovieOperator {
    private Movie[] movies;

    //定义一个有参构造器
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    //打印所有电影信息
    public void printAllMovies() {
        System.out.println("==============电影基本信息如下===============");
        for (int i = 0; i <movies.length ; i++) {
            Movie m = movies[i];
            System.out.println( m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor() + "\t" );
        }
    }

    //查找对应信息
    public void searchMoiveById() {
        System.out.println("请输入要查找的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println("==============电影基本信息如下===============");
                System.out.println( m.getId() + "\t" + m.getName() + "\t" + m.getPrice() + "\t" + m.getActor() + "\t" );
                return;
            }
        }
        System.out.println("没有找到对应的电影信息");
    }
}
