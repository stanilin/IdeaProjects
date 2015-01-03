package ru.javabegin.training.javastart2.bank;

/**
 * Created by Станислав on 29.12.2014.
 */
public class BankVTB extends Basebank {
    private String bankName;
    private float creditPersent;


    public String getNameVTB(){
        setName("VTB24");
        bankName = getName();
        return bankName;
    }
    public void creditCondition(){
        setCreditCondition(24);
        creditPersent = getCreditCondition();
        System.out.println("Процентная ставка по кредиту в банке "+bankName+" равна " +creditPersent+" процента(-ов)");
    }
}
