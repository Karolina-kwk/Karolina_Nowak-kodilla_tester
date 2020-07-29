package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;


    public Toyota(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getIncreaseSpeed() {
        return speed += 100;
    }

    @Override
    public int getDecreaseSpeed() {
        return speed -= 40;
    }

}
