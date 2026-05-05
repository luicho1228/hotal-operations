package com.plurasight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(){

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
        return reservationTotal;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}


