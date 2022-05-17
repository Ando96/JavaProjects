package com.company;

public class Chair {

    String colour;
    int numberOfCushions;
    String seatType;

    public Chair(String colour, int numberOfCushions, String seatType) {
        this.colour = colour;
        this.numberOfCushions = numberOfCushions;
        this.seatType = seatType;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfCushions() {
        return numberOfCushions;
    }

    public String getSeatType() {
        return seatType;
    }
}