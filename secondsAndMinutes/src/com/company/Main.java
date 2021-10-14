package com.company;

public class Main
{
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args)
    {
        System.out.println(getDurationString(65L,45L));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }


    private static String getDurationString(long minutes, long seconds)
    {
        if(minutes < 0 || seconds < 0 || seconds > 59)
        {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        return getDigit(hours) + "h " + getDigit(remainingMinutes) + "m " + getDigit(seconds) + "s";
    }


    private static String getDurationString(long seconds)
    {
        if(seconds < 0)
        {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes,remainingSeconds);
    }

    private static String getDigit(long x)
    {
        if (x < 10)
        {
            return "0" + x;
        }
        return ""+x;
    }
}