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
        int a = random.nextInt() * 100;
        int b = random.nextInt() * 100;
        int c = random.nextInt() * 100;
        if (drawCarKind == 0)
            return new Nissan(a);
        else if (drawCarKind == 1)
            return new Toyota(b);
        else
            return new Opel(c);
    }
}
