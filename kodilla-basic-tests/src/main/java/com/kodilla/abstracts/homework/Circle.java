package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private double r;
    private static double PI= 3.14159;

    public Circle(double r){
        this.r = r;
    }
    @Override
    public double calculateArea() {
        return PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * r;
    }

    public double getR() {
        return r;
    }
}
