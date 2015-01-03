package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class Car {
    private int distance;

    public void start(){
        System.out.println("Машина завелась");
    }
    public void stop(){
        System.out.println("Машина остановилась");
    }
    public int drive(int howlong){
        distance = howlong * 60;
        return distance;
    }

}
