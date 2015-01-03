package ru.javabegin.training.javastart2.clients;

import ru.javabegin.training.javastart2.interfaces.ClientsInterface;

/**
 * Created by Станислав on 29.12.2014.
 */
public abstract class Baseclient implements ClientsInterface {
    private String name;
    @Override
    public String getName() {
        return name;
    }
}
