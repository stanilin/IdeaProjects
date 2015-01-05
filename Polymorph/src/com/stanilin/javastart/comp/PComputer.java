package com.stanilin.javastart.comp;

/**
 * Created by stanilin on 05.01.2015.
 */
public class PComputer extends Computer {


    public PComputer(String type, String model, int ram, int hdd) {
        super(type, model, ram, hdd);
    }

    public void connect(){
        System.out.println("Компьютер типа "+getType()+", модель "+getModel()+" RAM: "+getRam()+" HDD: "+getHdd());
    }
}
