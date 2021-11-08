package edu.wctc.openclosedshapes.after.shapes;

import edu.wctc.openclosedshapes.after.Shape;

import java.awt.*;

public class Circle extends Shape {
    private double radius;
    private Point center;

    @Override
    public void draw() {
        // Imagine code to draw a circle
        System.out.println("Circle drawn");
    }

    @Override
    public void rotate() {
        // Not that a circle really does anything when rotated...
        System.out.println("Circle rotated");
    }
}
