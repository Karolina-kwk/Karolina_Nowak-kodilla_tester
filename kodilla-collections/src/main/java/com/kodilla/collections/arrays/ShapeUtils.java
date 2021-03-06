package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

public class ShapeUtils {
    public static void displayShapeInfo(Shape shape){
        System.out.println("-------------");
        System.out.println("shape kind: " + getShapeName(shape));
        System.out.println("shape area: " + shape.getArea());
        System.out.println("shape perimeter: " + shape.getPerimeter());
    }
    private static String getShapeName(Shape shape){
        if(shape instanceof Circle)
            return "Circle";
        else if (shape instanceof Triangle)
            return "Triangle";
        else if (shape instanceof Square)
            return "Square";
        else
            return "Unknow shape name";
    }
}
