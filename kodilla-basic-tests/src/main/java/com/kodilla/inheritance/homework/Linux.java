package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem {

    public Linux(int publishYear){
        super(publishYear);
        System.out.println("Linux, year of release" +" " + publishYear);
    }

    @Override
    public void turnOn(){
        System.out.println("Linux opearating system is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("Linux opearating system is off.");
    }
}
