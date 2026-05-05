package com.plurasight;

public class Employee {

    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

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

}

