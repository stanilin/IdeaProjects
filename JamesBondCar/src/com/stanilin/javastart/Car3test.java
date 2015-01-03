package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class Car3test {
    public static void main(String[] args) {

        Car3 car3 = new Car3();
        car3.start();
        car3.setDistance(80);
        car3.drive();
        System.out.println("Пройденное расстояние: "+car3.getDistance());
        car3.stop();
    }
}
