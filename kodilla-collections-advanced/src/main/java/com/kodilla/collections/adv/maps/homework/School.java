package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> schools = new ArrayList<>();

    public School(double ... schools){
        for (double school : schools)
            this.schools.add(school);
    }

    public double getSum() {
        double sum = 0.0;
        for (double school : schools)
            sum += school;
        return sum ;
    }

    @Override
    public String toString() {
        return "Schools" + schools.toString();
    }
}
