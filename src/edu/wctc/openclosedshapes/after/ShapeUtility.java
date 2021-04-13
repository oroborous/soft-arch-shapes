package edu.wctc.openclosedshapes.after;

public class ShapeUtility {

    public static void drawAllShapes(Shape[] list) {
        for (Shape shape : list) {
            shape.draw();
        }
    }
}
