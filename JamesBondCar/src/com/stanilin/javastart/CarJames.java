package com.stanilin.javastart;

/**
 * Created by Станислав on 01.01.2015.
 */
public class CarJames extends Car3 {

    @Override
    public int drive() {
        setDistance(getDistance() * 180);
        return getDistance();
    }
}

