package ru.javabegin.training.fastjava2.buyers;

/**
 * Created by Станислав on 26.12.2014.
 */
public class OnlineBuyer {
    private String name;
    private int numOfOrder;
    private String typeOfDelivery;

    public OnlineBuyer(String name, int numOfOrder, String typeOfDelivery) {
        this.setName(name);
        this.setNumOfOrder(numOfOrder);
        this.setTypeOfDelivery(typeOfDelivery);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfOrder() {
        return numOfOrder;
    }

    public void setNumOfOrder(int numOfOrder) {
        this.numOfOrder = numOfOrder;
    }

    public String getTypeOfDelivery() {
        return typeOfDelivery;
    }

    public void setTypeOfDelivery(String typeOfDelivery) {
        this.typeOfDelivery = typeOfDelivery;
    }


    public void registerOnSite(){
        System.out.println("Я зарегистрировался");
    }

    public void buy(){
        System.out.println("Я оплатил товар по номеру заказа: " +getNumOfOrder());
    }

    public void getGoods(){
        System.out.println("Я заберу покупку в ближайшем магазине");
    }
}
