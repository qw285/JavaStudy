package com.itheima.movie;

public class Test {
    public static void main(String[] args) {
        //目标：实现电影信息展示系统
        //1.实现电影对象封装
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "《阿甘正传》", "罗班·罗伯茨", 9.6);
        movies[1] = new Movie(2, "《千与千寻》", "宫崎骏", 9.5);
        movies[2] = new Movie(3, "《海王》", "罗伯茨·罗伯茨", 9.4);
        movies[3] = new Movie(4, "《海王2》", "罗伯茨·罗伯茨", 9.4);

        //2.通过电影操作对象实现打印所有信息，查找对应电影信息
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMoiveById();

    }

}
