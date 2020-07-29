package com.kodilla.collections.interfaces.homework;

public class Nissan implements Car {
    private int speed;

    public Nissan(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getIncreaseSpeed() {
        return speed +=50;
    }

    @Override
    public int getDecreaseSpeed() {
        return speed -= 10;
    }
}
