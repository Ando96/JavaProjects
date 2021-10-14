package com.company;

public class Main
{
    public static void main(String[] args)
    {

        System.out.println(getEvenDigitSum(252));

    }


    public static int getEvenDigitSum(int number)
    {
        if(number < 0)
        {
            return -1;
        }

        int total = 0;
        int digit = 0;

        while(number > 0)
        {
            digit = number % 10;

            total += (digit % 2 == 0) ? digit:0;

            number /= 10;
        }

        return total;
    }
}