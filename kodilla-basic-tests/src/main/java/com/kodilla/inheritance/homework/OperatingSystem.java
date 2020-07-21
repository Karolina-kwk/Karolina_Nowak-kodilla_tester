package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int publishYear;

    public OperatingSystem(int publishYear){
        this.publishYear = publishYear;
    }

    public void turnOn(){
        System.out.println("This opearating system is on.");

    }
    public void turnOff(){
        System.out.println("This opearating system is off.");
    }
    public int getPublishYear(){
        return publishYear;
    }
}
