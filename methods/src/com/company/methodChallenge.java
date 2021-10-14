package com.company;

public class methodChallenge
{
    public static void main(String[] args)
    {
        displayHighScorePosition("ryan",calculateHighScorePosition(1500));

        displayHighScorePosition("ryan",calculateHighScorePosition(900));

        displayHighScorePosition("ryan",calculateHighScorePosition(400));

        displayHighScorePosition("ryan",calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score)
    {
        if(score >= 1000)
        {
            return 1;
        }
        else if(score >= 500)
        {
            return 2;
        }
        else if(score >= 100)
        {
            return 3;
        }
        return 4;

        // int position = 4;
        //if(score >= 1000)
        //{
       //     position = 1
        //}
        //else if(score >= 500)
       // {
        // position = 2;
       // }
        //else if(score >= 100)
        //{
        // position = 3;
       // }

        // return position;
    }

    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println("Name: " + name + " " + "Position: " + position);
    }
}