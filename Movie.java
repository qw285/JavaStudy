package com.itheima.movie;

public class Movie {
    private int id;
    private String name;
    private String actor;
    private double price;

    // 定义无参构造方法
    public Movie() {}

    //定义有参构造器
    public Movie(int id, String namae, String actor, double price) {
        this.id = id;
        this.name = namae;
        this.actor = actor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String namae) {
        this.name = namae;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
