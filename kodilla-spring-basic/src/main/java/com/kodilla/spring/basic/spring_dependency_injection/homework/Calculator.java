package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double added = a + b;
        this.display.display(added);
        return added;
    }

    public double subtract(double a, double b) {
        double subtracted = a - b;
        this.display.display(subtracted);
        return subtracted;
    }

    public double multiply(double a, double b) {
        double multiplied =  a * b;
        this.display.display(multiplied);
        return multiplied;
    }

    public double divide(double a, double b) {
        double divided = a / b;
        this.display.display(divided);
        return divided;
    }
}
