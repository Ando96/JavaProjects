package com.company;

public class Main
{
    public static void main(String[] args)
    {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes <0)
        {
            System.out.println("Invalid Value");
        }else {
            int totalMegaBytes = kiloBytes / 1024;
            int totalBytes = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + totalMegaBytes + " MB and " + totalBytes + " KB");
        }
    }
}