package ru.javabegin.training.fastjava2.goods;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Pc {
    private String model;
    private int numOfKernel;
    private int price;

    public Pc(String model, int numOfKernel, int price) {
        this.setModel(model);
        this.setNumOfKernel(numOfKernel);
        this.setPrice(price);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfKernel() {
        return numOfKernel;
    }

    public void setNumOfKernel(int numOfKernel) {
        this.numOfKernel = numOfKernel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void on(){
        System.out.println("Компьютер включен");
    }

    public void off(){
        System.out.println("Компьютер выключен");
    }

}
