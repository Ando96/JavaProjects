package com.company;

public class Main
{
    public static void main(String[] args)
    {
//      int count = 1;
//
//      while(count != 6)
//      {
//          System.out.println("Count value is " + count);
//          count++;
//      }
//
//      for(int i = 6; i!= 6; i++)
//      {
//          System.out.println("Count value is " + i);
//      }
//
//        count = 1;
//
//      do {
//         System.out.println("Count value is " + count);
//          count++;
//      }while(count != 6);

        int number = 4;
        int finishNumber = 20;
        int total = 0;
        int evenNumbers = 0;

        while(number <= finishNumber)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }
            System.out.println("Even number " + number);
            total += number;
            evenNumbers++;

            if(evenNumbers == 5)
            {
                break;
            }
        }

    }

    public static boolean isEvenNumber(int number)
    {
        return number % 2 == 0;
    }
}