package ru.javabegin.training.javastart2.administration;

/**
 * Created by Станислав on 30.12.2014.
 */
public class Banker {
    private BaseEmployer name;

    public void getName(){
        this.name = new BaseEmployer();
        name.setName("ALIBEK");
        //this.name = baseEmployer.getName();
        System.out.println("Имя банкира: "+name.getName());
    }
}
