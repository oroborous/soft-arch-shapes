package openclosed.oop.shapes;

import openclosed.oop.Shape;
import openclosed.ShapeType;

import java.awt.*;

public class Square extends Shape {
    private double itsSide;
    private Point itsTopLeft;

    public Square() {
        itsType = ShapeType.SQUARE;
    }

    public void drawSquare() {
        // Imagine code to draw a square
        System.out.println("Square drawn");
    }
}
