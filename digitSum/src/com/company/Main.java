package com.company;

public class Main
{
    public static void main(String[] args)
    {
        sumDigits(125);
    }

    public static int sumDigits(int number)
    {
        if(number < 10)
        {
            return -1;
        }

        int total = 0;

        while(number > 0)
        {
            total += number % 10;
            number = number / 10;
        }

        System.out.println(total);

        return total;
    }
}