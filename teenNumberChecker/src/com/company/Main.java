package com.company;

public class Main
{
    public static void main(String[] args)
    {
        boolean result = hasTeen(9,99,19);
        System.out.println(result);

        result = hasTeen(23,15,42);
        System.out.println(result);

        result = hasTeen(22,33,34);
        System.out.println(result);
    }

    public static boolean hasTeen(int a, int b, int c)
    {
        return (isTeen(a)) || (isTeen(b)) || (isTeen(c));
    }

    public static boolean isTeen(int a)
    {
        return a >= 13 && a <= 19;
    }
}