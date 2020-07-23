package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
