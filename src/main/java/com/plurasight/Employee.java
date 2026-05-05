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

        return 0;
    }
    public int getOverTimeHours(){

        return 0;
    }

}

