package ru.javabegin.training.javastart2.bank;

import ru.javabegin.training.javastart2.interfaces.BankInterface;

/**
 * Created by Станислав on 29.12.2014.
 */
public abstract class Basebank implements BankInterface{
    private String name;
    private float creditCondition;

    @Override
    public void checkInfo(){

    }
    @Override
    public void giveCredit(){

    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCreditCondition() {
        return creditCondition;
    }

    public void setCreditCondition(float creditCondition) {
        this.creditCondition = creditCondition;
    }
}
