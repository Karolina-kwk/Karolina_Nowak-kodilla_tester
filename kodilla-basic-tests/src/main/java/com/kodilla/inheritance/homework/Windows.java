package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {

    public Windows(int publishYear){
        super(publishYear);
        System.out.println("Windows 10, year of release" +" "+ publishYear);
    }
    @Override
    public void turnOn(){
        System.out.println("Windows 10 opearating system is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("Windows 10 opearating system is off.");
    }
}
