package com.stanilin.javastart;

public class Main {

    public static void main(String[] args) {

        double doubleValue = 24.0;
        int intValue = (int)doubleValue;
        System.out.println("DoubleValue is: "+doubleValue);
        doSmth();

    }

    public static void doSmth(){
        System.out.println("Trying to call method doSmth without keyword 'static' - so, I can't call non static method from static main()");
    }
}
