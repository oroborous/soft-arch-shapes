package openclosed.oop.shapes;

import openclosed.oop.Shape;
import openclosed.ShapeType;

import java.awt.*;

public class Circle extends Shape {
    private double itsRadius;
    private Point itsCenter;

    public Circle() {
        itsType = ShapeType.CIRCLE;
    }

    public void drawCircle() {
        // Imagine code to draw a circle
        System.out.println("Circle drawn");
    }
}
