package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class Car3 {
    private int distance;


    public void start(){
        System.out.println("Машина завелась");
    }
    public void stop(){
        System.out.println("Машина остановилась");
    }
    public int drive(){
        setDistance(getDistance() * 60);
        return getDistance();
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
