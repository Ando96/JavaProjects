package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter number ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();

                if(first)
                {
                    first = false;
                    min = number;
                    max = number;

                }

                if(number > max)
                {
                    max = number;
                }else if(number < min)
                {
                    min = number;
                }
            }else{
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }

        scanner.close();

        System.out.println("Min number was " + min);
        System.out.println("Max number was " + max);
    }
}
