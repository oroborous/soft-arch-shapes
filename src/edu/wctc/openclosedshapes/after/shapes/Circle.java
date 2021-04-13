package edu.wctc.openclosedshapes.after.shapes;

import edu.wctc.openclosedshapes.after.Shape;
import edu.wctc.openclosedshapes.ShapeType;

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
