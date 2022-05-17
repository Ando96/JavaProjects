package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Bird bird = new Parrot("Australian ringneck");
        bird.breathe();
        bird.eat();
        bird.fly();

        Bird penguin = new Penguin("Emperor");
        penguin.fly();
    }
}