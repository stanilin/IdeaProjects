package ru.javabegin.training.fastjava2.goods;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Tv {
    private String model;
    private int size;
    private int price;


    public Tv(String model, int size, int price) {
        this.setModel(model);
        this.setSize(size);
        this.setPrice(price);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void on(){
        System.out.println("Телевизор включен");
    }

    public void off(){
        System.out.println("Телевизор выключен");
    }
}
