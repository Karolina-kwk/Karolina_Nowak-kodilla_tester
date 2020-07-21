package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args){

        Windows windows = new Windows(2015);
        windows.turnOn();

        Linux linux = new Linux(1991);
        linux.turnOff();
    }

}
