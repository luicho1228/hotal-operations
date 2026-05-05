package com.plurasight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccoupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(){

    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccoupied() {
        return isOccoupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
