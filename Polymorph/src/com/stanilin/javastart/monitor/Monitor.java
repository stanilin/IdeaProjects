package com.stanilin.javastart.monitor;

import com.stanilin.javastart.comp.Computer;
import com.stanilin.javastart.comp.Notebook;
import com.stanilin.javastart.comp.PComputer;
import com.stanilin.javastart.comp.TabletPC;

/**
 * Created by stanilin on 05.01.2015.
 */
public class Monitor {


    public void connectDevice(Computer comp){
        if (comp instanceof PComputer){
            ((PComputer)comp).connect();
        } else if (comp instanceof Notebook){
            ((Notebook)comp).connect();
        } else {
            ((TabletPC) comp).connect();
        }

    }
}
