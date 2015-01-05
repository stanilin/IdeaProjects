package com.stanilin.javastart;


import com.stanilin.javastart.House.House;

public class Main {
    //House house = new House(); //Вынос создания объекта на уровень класса с вызовом его в классе Main с помощью this.house.welcomeHouse() не работает
    public static void main(String[] args) {
        House house = new House();
        house.welcomeHouse();

    }
}
