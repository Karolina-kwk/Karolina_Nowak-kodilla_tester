package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for ( Car car : cars)
            CarUtils.describeCar(car);

    }
    public static Car drawCar() {
        Random random = new Random();
        int drawCarKind = random.nextInt(3);
        Car randomCar = new Nissan(100);

        if (drawCarKind == 0)
            randomCar = new Opel(100);
        else if (drawCarKind == 1)
            randomCar = new Toyota(120);
        else
            randomCar = new Opel(140);

        for(int i=0; i < random.nextInt(4); i++)
            randomCar.getDecreaseSpeed();
        return randomCar;
    }
}
