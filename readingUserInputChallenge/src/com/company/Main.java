package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	    int total = 0;
	    int counter = 0;
	    int max = 10;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int number = scanner.nextInt();
                total += number;
                counter++;
                if(counter == 10)
                {
                    break;
                }
            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Total " + total);
        scanner.close();
    }
}