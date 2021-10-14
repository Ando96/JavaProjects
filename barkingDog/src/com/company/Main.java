package com.company;

public class Main
{
    public static void main(String[] args)
    {

        shouldWakeUp(true,1); //true
        shouldWakeUp(false,2); //false
        shouldWakeUp(true,8); //false
        shouldWakeUp(true,-1); //false

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(hourOfDay <0 || hourOfDay >23)
        {
        return false;
        }
        else if(barking && hourOfDay < 8 || hourOfDay > 22)
        {
            return true;
        }
        return false;
    }
}