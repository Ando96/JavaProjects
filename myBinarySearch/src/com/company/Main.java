package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[128];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        binarySearch(array,8);
    }

    public static int binarySearch(int[] array, int value){

        int low = 0;
        int high = array.length - 1;
        int mid = (low + high) / 2;
        int divisions = 0;

        while(low <= high) {
            divisions++;
            int guess = array[mid];
            System.out.println("Guess " + guess);
            if (guess == value) {
                System.out.println("Found " + value);
                System.out.println("Divisions "+ divisions);
                return guess;
            }
            if (guess < value) {
                low = mid + 1;
            }
            if (guess > value) {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        System.out.println("Value not found");
        return -1;
    }
}