package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(sumOdd(1,11));
        System.out.println(sumOdd(-4,6));
    }

    public static boolean isOdd(int number)
    {
        if(number <= 0)
        {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end)
    {
        if((start < 0 || end < 0) || (start > end))
        {
            return -1;
        }

        int total = 0;

        for(int i = start; i <= end; i++)
        {
            if(isOdd(i))
            {
                total += i;
            }
        }
        return total;
    }
}