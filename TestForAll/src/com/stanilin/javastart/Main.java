package com.stanilin.javastart;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 24.0;
        int intValue = (int)doubleValue;
        System.out.println("DoubleValue is: "+doubleValue);
        doSmth(20);

    }

    public static void doSmth(int var){
        int var1 = var;
        if(var1 > 10)
        {
            System.out.println("Inside if");
            if(var1 < 21)
            { System.out.println("var1 is greater than 10 and less than 21");
                //System.out.println("var1 = "+var);
            }
            else if (var1 == 20)
            {
                System.out.println("var1 == 20, here was a mistake");
            }
            else
            {
                System.out.println("Inside Else statement");
            }
            System.out.println("Outside else if");
        }
        System.out.println("var1= "+var1);
    }
}
