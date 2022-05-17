package com.company;

public class Lamp {

    int brightness;
    String lampType;

    public Lamp(int brightness, String lampType) {
        this.brightness = brightness;
        this.lampType = lampType;
    }

    public void turnOn(){
        System.out.println("Turning on lamp");
    }

    public int getBrightness() {
        return brightness;
    }

    public String getLampType() {
        return lampType;
    }
}