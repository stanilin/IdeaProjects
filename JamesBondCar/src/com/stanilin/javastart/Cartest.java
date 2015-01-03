package com.stanilin.javastart;

public class Cartest {

    public static void main(String[] args) {
        int testcar;
        Car car = new Car();

        car.start();
        testcar = car.drive(60);
        System.out.println("Пройденное расстояние: "+testcar);
        car.stop();


    }

}
