package ru.javabegin.training.javastart2.administration;

/**
 * Created by Станислав on 30.12.2014.
 */
public class CompEmployer extends BaseEmployer {
    //private String name;

       public void printName(){
           setName("SULIK");

           //name = getName();

            System.out.println("Имя CompEmployer is " + getName());
    }


}
