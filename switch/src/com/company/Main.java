package com.company;

import java.util.Locale;

public class Main
{
    public static void main(String[] args)
    {
        int value = 1;

        if(value == 1)
        {
            System.out.println("1");
        } else if(value == 2) {
            System.out.println("2");
        } else {
            System.out.println("Not 1 or 2");
        }

        int switchValue = 1;

        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3 4 or 5");
                break;

            default:
                System.out.println("was not 1 2 3 4 or 5");
                break;
        }


        char character = 'F';

        switch (character){
            case 'A':
                System.out.println("was A");
                break;

            case 'B':
                System.out.println("was B");
                break;

            case 'C':
                System.out.println("was C");
                break;

            case 'D':
                System.out.println("was D");
                break;

            case 'E':
                System.out.println("was E");
                break;

            default:
                System.out.println("was not A B C D or E");
                break;
        }
    }
}