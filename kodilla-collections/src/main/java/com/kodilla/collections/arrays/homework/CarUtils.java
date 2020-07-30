package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("-------------");
        System.out.println("car kind: " + getCarName(car));
        System.out.println("car increased speed: " + car.getIncreaseSpeed() );
        System.out.println("car decreased speed : " + car.getDecreaseSpeed() );

    }

    private static String getCarName(Car car){
        if(car instanceof Nissan)
            return "Nissan";
        else if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknow car name";
    }
}
