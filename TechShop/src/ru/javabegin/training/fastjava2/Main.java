package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.administration.Cassier;
import ru.javabegin.training.fastjava2.administration.Director;
import ru.javabegin.training.fastjava2.administration.Qmanager;
import ru.javabegin.training.fastjava2.administration.Smanager;
import ru.javabegin.training.fastjava2.buyers.OnlineBuyer;
import ru.javabegin.training.fastjava2.buyers.UsualBuyer;
import ru.javabegin.training.fastjava2.goods.Fridge;
import ru.javabegin.training.fastjava2.goods.Pc;
import ru.javabegin.training.fastjava2.goods.Smartphone;
import ru.javabegin.training.fastjava2.goods.Tv;
import ru.javabegin.training.fastjava2.salors.FridgeSalor;
import ru.javabegin.training.fastjava2.salors.PCSalor;
import ru.javabegin.training.fastjava2.salors.PhoneSalor;
import ru.javabegin.training.fastjava2.salors.TVSalor;

public class Main {

    public static void main(String[] args) {
        UsualBuyer usualBuyer = new UsualBuyer("male","cash");
        OnlineBuyer onlineBuyer = new OnlineBuyer("John",255,"SelfDelivery");
        Cassier cassier = new Cassier("Mike");
        Director director = new Director("Stan");
        Qmanager qmanager = new Qmanager("Sergey");
        Smanager smanager = new Smanager("Dima");
        FridgeSalor fridgeSalor = new FridgeSalor("Andrew","male");
        PCSalor pcSalor = new PCSalor("Yura","male");
        PhoneSalor phoneSalor = new PhoneSalor("Alina","female");
        TVSalor tvSalor = new TVSalor("Olga","female");



        usualBuyer.goodsChoose();
        phoneSalor.consult();
        usualBuyer.buy();
        phoneSalor.signOrder();
        smanager.checkOrder();
    }
}
