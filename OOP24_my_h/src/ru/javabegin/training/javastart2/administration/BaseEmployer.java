package ru.javabegin.training.javastart2.administration;

import ru.javabegin.training.javastart2.interfaces.EmployerInterface;

/**
 * Created by Станислав on 30.12.2014.
 */
public abstract class BaseEmployer implements EmployerInterface{
    private String name;
    private String department;
    private boolean freeState;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isFreeState() {
        return freeState;
    }

    public void setFreeState(boolean freeState) {
        this.freeState = freeState;
    }
}
