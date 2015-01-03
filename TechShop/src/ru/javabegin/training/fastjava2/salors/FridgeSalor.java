package ru.javabegin.training.fastjava2.salors;

/**
 * Created by Станислав on 26.12.2014.
 */
public class FridgeSalor {
    private String name;
    private String gender;

    public FridgeSalor(String name, String gender) {
        this.setName(name);
        this.setGender(gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void consult(){
        System.out.println("Я Вас проконсультирую по интересующему Вас товару");
    }

    public void signOrder(){
        System.out.println("Сейчас я выпишу заказ по данному товару для оплаты");
    }
}
