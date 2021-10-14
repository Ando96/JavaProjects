package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0,2.0));
        //System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0,3.0));
        //System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0,4.0));
        //System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0,5.0));

        for(double i = 2.0; i < 9; i++)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println("BREAK");

        for(double i = 8.0; i > 0.0; i--)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        int count = 0;
        for(int i = 2; i < 20; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
                count++;
                if(count == 3)
                {
                    break;
                }
            }
        }

        int counter = 0;
        int total = 0;
        for(int i = 1; i <= 1000; i++)
        {
            if((i % 3 == 0)  && (i % 5 == 0))
            {
                System.out.println("Found number " + i);
                total += i;
                counter++;
            }
            if(counter == 5)
            {
                break;
            }
        }
        System.out.println("Total " + total);
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}