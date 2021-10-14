package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int number)
    {
        if(number < 0)
        {
            number *= -1;
        }

        int reverse = 0;
        int numberCopy = number;

        while (number > 0)
        {
            int lastDigit = number % 10;

            reverse = (reverse * 10) + lastDigit;

            number /= 10;
        }
        return numberCopy == reverse;
    }
}