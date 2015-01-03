package ru.javabegin.training.fastjava2.buyers;

import ru.javabegin.training.fastjava2.goods.Fridge;
import ru.javabegin.training.fastjava2.goods.Pc;
import ru.javabegin.training.fastjava2.goods.Smartphone;
import ru.javabegin.training.fastjava2.goods.Tv;

/**
 * Created by Станислав on 26.12.2014.
 */
public class UsualBuyer {
    private String gender;
    private String typeOfPayment;

    public UsualBuyer(String gender, String typeOfPayment) {
        this.setGender(gender);
        this.setTypeOfPayment(typeOfPayment);
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    Fridge fridge = new Fridge("LG",4,142000);
    Pc pc = new Pc("Lenovo",8,130000);
    Smartphone smartphone = new Smartphone("Asus","black",38000);
    Tv tv = new Tv("Samsung",42,85000);

    public void goodsChoose(){
        System.out.println("Я бы хотел купить товар "+smartphone.getModel()+" "+smartphone.getColor()+" в Вашем магазине");
    }

    public void buy(){

        System.out.println("Хорошо, могу я купить этот товар с помощью " +getTypeOfPayment()+"?");
    }

    public void getGarantee(){
        System.out.println("Выпишите мне гарантийный талон");
    }
}
