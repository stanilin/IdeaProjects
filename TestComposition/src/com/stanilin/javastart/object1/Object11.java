package com.stanilin.javastart.object1;

/**
 * Created by Станислав on 30.12.2014.
 */
public class Object11 {
    private String name;
    private int num;

    public Object11(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public void printObject(){
        System.out.println("Имя объекта1 "+name);
        System.out.println("Число объекта1 "+num);
    }
}
