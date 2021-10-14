package com.company;

public class Main
{

    public static void main(String[] args)
    {
       isPerfectNumber(6);
    }


    public static boolean isPerfectNumber(int number)
    {
        if(number < 1)
        {
            return false;
        }

        int sumOfProperDivisors = 0;
        int increment = (number % 2 == 0) ? 1 : 2;

        for (int i = 1; i <= number/2; i += increment) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors == number;
    }
}