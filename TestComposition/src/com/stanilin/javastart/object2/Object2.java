package com.stanilin.javastart.object2;

import com.stanilin.javastart.object1.Object1;

/**
 * Created by Станислав on 30.12.2014.
 */
public class Object2 {
    private Object1 object1;

    public Object2(){
        this.object1 = new Object1();
        object1.setName("Имя 1");
        object1.setNum(24);
    }
    public void printObject1(){
        object1.printObject();
    }
}
