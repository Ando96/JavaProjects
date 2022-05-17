package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] returnedArray = reverse(array);
        printArray(returnedArray);
    }

    public static int[] reverse(int[] a){

        int maxIndex = a.length -1;
        int halfLength = a.length /2;
        for(int i = 0; i < halfLength; i++){
            int temp = a[i];
            a[i] = a[maxIndex - i];
            a[maxIndex -i] = temp;
        }

//        int n = a.length;
//        int j = n;
//
//        int[] b = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            b[j - 1] = a[i];
//            j = j - 1;
//        }
        return a;
    }

    private static void printArray(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}