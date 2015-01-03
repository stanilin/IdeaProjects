package ru.javabegin.training.fastjava2.administration;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Qmanager {
    private String name;

    public Qmanager(String name) {
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkGoods(){
        System.out.println("Проверка техники прошла успешно");
    }

    public void packing(){
        System.out.println("Купленный товар упакован");
    }
}
