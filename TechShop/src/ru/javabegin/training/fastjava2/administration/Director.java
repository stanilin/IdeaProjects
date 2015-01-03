package ru.javabegin.training.fastjava2.administration;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Director {
    private String name;

    public Director(String name) {
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sayOk(){
        System.out.println("Заказ одобрен");
    }
}
