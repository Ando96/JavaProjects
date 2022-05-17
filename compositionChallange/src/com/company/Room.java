package com.company;

public class Room {

    private TV tv;
    private Chair chair;
    private Table table;
    private Bed bed;

    public Room(TV tv, Chair chair, Table table, Bed bed) {
        this.tv = tv;
        this.chair = chair;
        this.table = table;
        this.bed = bed;
    }

   public void makeBed(){
        bed.make();
       System.out.println("Bed made");
   }

   public void turnOnTV(){
        tv.turnOn();
       System.out.println("TV on");
   }

   public void turnOnLamp(){
        table.getLamp().turnOn();
       System.out.println("lamp on");
   }
}