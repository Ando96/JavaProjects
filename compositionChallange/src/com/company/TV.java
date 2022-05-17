package com.company;

public class TV {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public TV(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void turnOn(){
        System.out.println("Turning on TV");
        tvLogo(1200,50,"yellow");
    }

    public void tvLogo(int x, int y, String colour){
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}