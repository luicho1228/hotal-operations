package com.plurasight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType){

        this.roomType = roomType;
        if (getRoomType().equalsIgnoreCase("King")){
            price = 139.00;
        } else if (getRoomType().equalsIgnoreCase("double")) {
            price = 124.00;
        }
        double weekendPrice = price * ((double) 10 /100);
        if (isWeekend()){
            price += weekendPrice;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        return price;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public double getReservationTotal() {
        return getNumberOfNights() * getPrice();
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}


