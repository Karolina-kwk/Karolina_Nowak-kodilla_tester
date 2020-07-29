package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Nissan nissan = new Nissan(100);
        DoRace(nissan);
        Toyota toyota = new Toyota(50);
        DoRace(toyota);
        Opel opel = new Opel(70);
        DoRace(opel);
    }
    public static void DoRace(Car car) {
        for (int i = 0; i < 3; i++) {
            System.out.println(car.getClass().getSimpleName() + " speed after increase equals: " + car.getIncreaseSpeed());
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(car.getClass().getSimpleName() +" speed after decrease equals: " + car.getDecreaseSpeed());
        }
    }

}
