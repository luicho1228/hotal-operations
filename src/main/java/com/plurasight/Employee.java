package com.plurasight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;
    private int startTime;

    public Employee(){
    }
    public double getTotalPay(){
        return payRate * hoursWorked;
    }
    public int getRegularHours(){
        int regularHours = 0;
        if (hoursWorked <= 40){
            regularHours += hoursWorked;
        }
        return regularHours;
    }
    public int getOverTimeHours(){
        int overTimeHours = 0;
        if (overTimeHours > 40){
            overTimeHours = hoursWorked - 40;
        }
        return overTimeHours;
    }
    public void punchIn(int time){
        startTime = time;
    }
    public void punchOut(int time){
        if (time < startTime){
            time += 12;
        }
        hoursWorked = Math.abs(time - startTime);
    }
    public int getStartTime(){
        return startTime;
    }
}

