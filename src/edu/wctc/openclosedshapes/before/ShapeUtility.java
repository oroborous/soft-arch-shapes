package edu.wctc.openclosedshapes.before;

import edu.wctc.openclosedshapes.before.shapes.Circle;
import edu.wctc.openclosedshapes.before.shapes.Square;

public class ShapeUtility {

    // What needs to change when we want to add an oval or triangle?
    public static void drawAllShapes(Object[] list) {
        for (Object obj : list) {
            if (obj instanceof Circle) {
                Circle c = (Circle) obj;
                c.drawCircle();
            } else if (obj instanceof Square) {
                Square s = (Square) obj;
                s.drawSquare();
            }
        }
    }

    public static void rotateAllShapes(Object[] list) {
        //...
    }

    public static void enlargeAllShapes(Object[] list) {
        // ...
    }

    public static void shrinkAllShapes(Object[] list) {
        // ...
    }
}
