package com.plurasight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price){
        this.numberOfBeds = numberOfBeds;
        this.price = price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty() && !isOccupied();
    }

    public void checkIn(){
        isOccupied = true;
        isDirty = true;
    }
    public void checkOut(){
        cleanRoom();
        isOccupied = false;
    }
    public void cleanRoom(){
        isDirty = false;
    }
}
