package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Enter count: ");
//        int count = scanner.nextInt();

        int count = readInteger();

        int[] returnedArray = readIntegers(count);

        System.out.println("Min value from array = " + findMin(returnedArray));
    }

    private static int[] readIntegers(int count){

        int[] array = new int[count];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//        int count = 0;
//        while(count != 5){
//            values[count] = scanner.nextInt();
//            count ++;
//        }
        return array;
    }

    public static int readInteger(){
        System.out.println("Enter count: ");
        return scanner.nextInt();
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i =0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }

//        for (int j : array) {
//            if (j < min) {
//                min = j;
//            }
//        }
        return min;
    }
}