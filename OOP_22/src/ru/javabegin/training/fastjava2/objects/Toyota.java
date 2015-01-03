package ru.javabegin.training.fastjava2.objects;

/**
 * Created by Станислав on 27.12.2014.
 */
public class Toyota {

    private String name;
    private double volume;


    public Toyota(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Toyota(String name) {
        this.name = name;
    }


    public Toyota(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
