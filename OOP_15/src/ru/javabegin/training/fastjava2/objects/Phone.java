package ru.javabegin.training.fastjava2.objects;

/**
 * Created by Станислав on 25.12.2014.
 */
public class Phone {
    private int ram;
    private String name;
    private String type;
    private int bateryCapacity;
    private int ppi;


       public Phone(int bateryCapacity, int ppi,int ram, String name, String type) {
        this.ram = ram;
        this.name = name;
        this.type = type;
        this.setBateryCapacity(bateryCapacity);
        this.setPpi(ppi);
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBateryCapacity() {
        return bateryCapacity;
    }

    public void setBateryCapacity(int bateryCapacity) {
        this.bateryCapacity = bateryCapacity;
    }

    public int getPpi() {
        return ppi;
    }

    public void setPpi(int ppi) {
        this.ppi = ppi;
    }
}
