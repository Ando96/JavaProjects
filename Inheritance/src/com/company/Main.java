package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",8,20,2,4,1,20,"Long silky");

        Fish fish = new Fish("Goldfish",1,1,2,2,4);

        dog.eat();
//        dog.walk();
//        dog.run();

//        fish.swim(5);
        //fish.rest();
    }
}