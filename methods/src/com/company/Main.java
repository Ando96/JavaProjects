package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int result  = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + result);

        result = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + result);
    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus)
    {
        if(isGameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}