package edu.wctc.openclosed.oop.shapes;

import edu.wctc.openclosed.oop.Shape;
import edu.wctc.openclosed.ShapeType;

import java.awt.*;

public class Square extends Shape {
    private double sideLength;
    private Point topLeft;

    public Square() {
        type = ShapeType.SQUARE;
    }

    public void draw() {
        // Imagine code to draw a square
        System.out.println("Square drawn");
    }
}
