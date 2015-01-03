package ru.javabegin.training.fastjava2.administration;

/**
 * Created by Станислав on 26.12.2014.
 */
public class Smanager {
    private String name;

    public Smanager(String name) {
        this.setName(name);
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void checkOrder(){
        System.out.println("Меня зовут "+getName()+".Проверка заявки продавца прошла успешно");
    }

    public void goToCassier(){
        System.out.println("Ваш заказ передан на кассу");
    }
}
