package ru.javabegin.training.javastart2;


import ru.javabegin.training.javastart2.administration.Banker;
import ru.javabegin.training.javastart2.administration.CompEmployer;
import ru.javabegin.training.javastart2.administration.PlayEmployer;
import ru.javabegin.training.javastart2.bank.BankVTB;

public class SalesRoom {
    //private String name;

    public static void main(String[] args) {
        CompEmployer compEmployer = new CompEmployer();
        PlayEmployer playEmployer = new PlayEmployer();
        Banker banker = new Banker();
        BankVTB bankVTB = new BankVTB();
        playEmployer.printPlayEmployer();
        compEmployer.printName();
        banker.getName();
        bankVTB.getNameVTB();
        bankVTB.creditCondition();

    }
}
