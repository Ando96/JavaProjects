package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Tim",50,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}