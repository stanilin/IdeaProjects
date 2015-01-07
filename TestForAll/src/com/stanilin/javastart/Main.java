package com.stanilin.javastart;

public class Main {


    public static void main(String[] args) {



        String [][] stringArray = new String[3][2];
        stringArray[0][0] = "Suhrab";
        stringArray[0][1] = "Karimov";
        stringArray[1][0] = "Anel";
        stringArray[1][1] = "Gevorkyan";
        stringArray[2][0] = "Lionel";
        stringArray[2][1] = "Karimov";



        for (int i = 0; i < stringArray.length; i++){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j<stringArray[i].length; j++){
                stringBuilder.append(stringArray[i][j]);

            }
            System.out.println(stringBuilder);
        }
        }
}
