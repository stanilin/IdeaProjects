package ru.javabegin.training.fastjava2.objects;

/**
 * Created by Станислав on 27.12.2014.
 */
public class Camry extends Toyota {

    public Camry(String name, double volume) {
        super(name, volume);
    }

    public Camry(String name) {
        super(name);
    }

    public Camry(double volume) {
        super(volume);
    }
}
