package ru.javabegin.training.fastjava2.objects;

/**
 * Created by Станислав on 27.12.2014.
 */
public class Camry50 extends Camry30 {
    @Override
    public void drive(){
        System.out.println("Camry50 is driving");
    }

    public void light(){
        System.out.println("Camry50 light");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.println("Camry50 Stop");
    }

}
