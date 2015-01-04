package com.stanilin.javastart.House;

import com.stanilin.javastart.objects.Door;


public class House {
    private Door door;


    public void welcomeHouse(){
        this.door = new Door();
        door.setColor("Golden");
        door.setLength(243.5f);
        door.setHeight(185.4f);
        door.setWidth(55.4f);
        door.doorOpen();
        door.doorClose();
    }

}
