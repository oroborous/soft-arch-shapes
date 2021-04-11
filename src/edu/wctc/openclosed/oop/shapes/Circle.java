package edu.wctc.openclosed.oop.shapes;

import edu.wctc.openclosed.oop.Shape;
import edu.wctc.openclosed.ShapeType;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private Point center;

    public Circle() {
        type = ShapeType.CIRCLE;
    }

    public void draw() {
        // Imagine code to draw a circle
        System.out.println("Circle drawn");
    }
}
