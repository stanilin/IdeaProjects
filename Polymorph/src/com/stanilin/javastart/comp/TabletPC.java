package com.stanilin.javastart.comp;

/**
 * Created by stanilin on 05.01.2015.
 */
public class TabletPC extends Computer {




    public TabletPC(String type, String model, int ram, int hdd) {
        super(type, model, ram, hdd);
    }

    public void connect(){
        System.out.println("Компьютер типа "+getType()+", модель "+getModel()+" RAM: "+getRam()+" HDD: "+getHdd());
    }
}
