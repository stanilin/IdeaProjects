package com.stanilin.javastart;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Karim");
        arrayList.add("Baidar");
        System.out.println(arrayList);
        arrayList.add("Arsen");
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        }

}
