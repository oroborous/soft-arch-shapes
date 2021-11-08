package edu.wctc.openclosedshapes.after.shapes;

import edu.wctc.openclosedshapes.after.Shape;

import java.awt.*;

public class Square extends Shape {
    private double sideLength;
    private Point topLeft;

    @Override
    public void draw() {
        // Imagine code to draw a square
        System.out.println("Square drawn");
    }

    @Override
    public void rotate() {
        // Imagine code to rotate a square
        System.out.println("Square rotated");
    }
}
