package com.company;

public class Main {

    public static void main(String[] args) {


        Bed theBed = new Bed("Modern",4,3,2,1);
        TV theTV = new TV("LED","LG",50,new Resolution(2540,1440));
        Chair theChair = new Chair("blue",1,"Comfy");
        Table theTable = new Table("brown","Bedside",new Lamp(50,"Bedside"));

        Room bedRoom = new Room(theTV,theChair,theTable, theBed);

        bedRoom.makeBed();
        bedRoom.turnOnLamp();
        bedRoom.turnOnTV();
    }
}