package com.stanilin.javastart.object1;

/**
 * Created by Станислав on 30.12.2014.
 */
public class Object1 {
    private String name;
    private int num;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void printObject(){
        System.out.println("Имя объекта1 "+getName());
        System.out.println("Число объекта1 "+getNum());
    }
}
