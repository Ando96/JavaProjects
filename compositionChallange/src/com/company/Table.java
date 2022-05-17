package com.company;

public class Table {

    private String colour;
    private String tableType;
    private Lamp lamp;

    public Table(String colour, String tableType, Lamp lamp) {
        this.colour = colour;
        this.tableType = tableType;
        this.lamp = lamp;
    }

    public String getColour() {
        return colour;
    }

    public String getTableType() {
        return tableType;
    }

    public Lamp getLamp() {
        return lamp;
    }
}
