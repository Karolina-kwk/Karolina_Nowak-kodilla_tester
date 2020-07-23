package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Square area with side length: "+ square.getA() + " equals "+square.calculateArea());
        System.out.println("Square permieter with side length: "+ square.getA() + " equals " +square.calculatePerimeter());


        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("Rectangle area with width a: "+ rectangle.getA() +" and height b: " + rectangle.getB() + " equals "+rectangle.calculateArea());
        System.out.println("Rectangle permieter with width a: "+ rectangle.getA() +" and height b: "+ rectangle.getB()+" equals " +rectangle.calculatePerimeter());

        Circle circle = new Circle(4);
        System.out.println("Circle area with radius: "+ circle.getR() + " equals "+circle.calculateArea());
        System.out.println("Circle permieter with radius: "+ circle.getR() + " equals " +circle.calculatePerimeter());


    }
}
