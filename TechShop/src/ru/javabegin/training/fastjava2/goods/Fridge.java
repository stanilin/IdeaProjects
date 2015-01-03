package ru.javabegin.training.fastjava2.goods;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Fridge {
    private String model;
    private int numOfCameras;
    private int price;

    public Fridge(String model, int numOfCameras, int price) {
        this.setModel(model);
        this.setNumOfCameras(numOfCameras);
        this.setPrice(price);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public void on(){
        System.out.println("Холодильник включен");
    }

    public void off(){
        System.out.println("Холодильник выключен");
    }


}
