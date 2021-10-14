package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        float myFloat = 2.5F;
        System.out.println(myFloat);

        double myDouble = 2.523423534653D;
        System.out.println(myDouble);

        String test1 = "5";
        String test2 = "5";

        int testResult = Integer.parseInt(test1) + Integer.parseInt(test2);
        System.out.println(testResult);


        boolean isCar = false;

        boolean wasCar = isCar ? true : false;

        if(wasCar){
            System.out.println("wasCar is true");
        }


        int playersLives =3;

        System.out.println("Lives" + playersLives--);
        System.out.println("Lives" + playersLives);
        System.out.println("Lives" + --playersLives);






    }
}