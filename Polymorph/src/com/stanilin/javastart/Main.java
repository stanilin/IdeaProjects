package com.stanilin.javastart;

import com.stanilin.javastart.comp.Computer;
import com.stanilin.javastart.comp.Notebook;
import com.stanilin.javastart.comp.PComputer;
import com.stanilin.javastart.comp.TabletPC;
import com.stanilin.javastart.monitor.Monitor;

public class Main {

    public static void main(String[] args) {


        Computer notebook = new Notebook("Notebook","Lenovo",4096,500);
        Computer pcComputer = new PComputer("PC","Dell",2048,750);
        Computer tablet = new TabletPC("Tablet","iPad",512,32);
        Monitor monitor = new Monitor();

        monitor.connectDevice(tablet);


    }
//    public static void connectAll(Computer comp){
//        if (comp instanceof PComputer){
//            ((PComputer)comp).connect();
//        } else if (comp instanceof Notebook){
//            ((Notebook)comp).connect();
//        } else {
//            ((TabletPC) comp).connect();
//        }


}
