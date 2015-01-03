package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class TestCarJames {
    public static void main(String[] args) {

        CarJames carJames = new CarJames();
        carJames.start();
        carJames.setDistance(10);
        carJames.drive();
        System.out.println("Пройденное расстояние: "+carJames.getDistance());
        carJames.stop();
    }
}
