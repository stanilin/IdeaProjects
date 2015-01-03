package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class Car2 {
    private int distance;

    public Car2(int distance) {
        this.distance = distance;
    }

    public void start(){
        System.out.println("Машина завелась");
    }
    public void stop(){
        System.out.println("Машина остановилась");
    }
    public int drive(){
        distance = distance * 60;
        return distance;
    }
    public void printdistance(){
        System.out.println("Пройденное расстояние: "+distance);

    }
}
