package com.stanilin.javastart;

public class Main {


    public static void main(String[] args) {

        //double doubleValue = 24.0;
        //int intValue = (int)doubleValue;
        //System.out.println("DoubleValue is: "+doubleValue);

        doSmth();

    }

    public static void doSmth() {
        int i=30;
        switch(i)
        {
            case 10 : System.out.println("Case 10!");
                break;
            case 20 : System.out.println("Case 20!");
                break;
            default : System.out.println("Default Case");
            break;
        }
    }
}
