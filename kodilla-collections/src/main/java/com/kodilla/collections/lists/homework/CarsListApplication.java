package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Nissan;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Nissan(100));
        Toyota toyota = new Toyota(50);
        cars.add(toyota);
        cars.add(new Opel(30));

        cars.remove(2);
        cars.remove(toyota);


        System.out.println(cars.size());

        for(Car car : cars){
            CarUtils.describeCar(car);
        }




    }
}
