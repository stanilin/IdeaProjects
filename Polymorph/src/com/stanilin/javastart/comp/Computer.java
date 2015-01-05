package com.stanilin.javastart.comp;

/**
 * Created by stanilin on 05.01.2015.
 */
public class Computer {
    private String type;
    private String model;
    private int ram;
    private int hdd;


    public Computer(String type, String model, int ram, int hdd) {
        this.setType(type);
        this.setModel(model);
        this.setRam(ram);
        this.setHdd(hdd);
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}
