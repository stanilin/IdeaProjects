package com.stanilin.javastart.Object2;

import com.stanilin.javastart.Object1.Object1;

/**
 * Created by stanilin on 04.01.2015.
 */
public class Object2 extends Object1 {

   private String weight;
    private String color = super.getColor();

    public Object2(String color, String weight) {
        super(color);
        this.weight = weight;
    }

    public void printProperties(){
        System.out.println("Color of Object2 is "+color);
        System.out.println("Weight of Object2 is "+weight);
    }
}
