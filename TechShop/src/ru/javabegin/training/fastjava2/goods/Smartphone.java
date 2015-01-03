package ru.javabegin.training.fastjava2.goods;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Smartphone {
    private String model;
    private String color;
    private int price;


    public Smartphone(String model, String color, int price) {
        this.setModel(model);
        this.setColor(color);
        this.setPrice(price);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void on(){
        System.out.println("Смартфон включен");
    }

    public void off(){
        System.out.println("Смартфон выключен");
    }
}
