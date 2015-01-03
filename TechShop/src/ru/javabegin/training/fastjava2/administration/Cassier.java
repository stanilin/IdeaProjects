package ru.javabegin.training.fastjava2.administration;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Cassier {
    private String name;

    public Cassier(String name) {
        this.setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void acceptOrder(){
        System.out.println("Принял заказ");
    }

    public void takeMoney(){
        System.out.println("Принял деньги за товар");
    }
}
