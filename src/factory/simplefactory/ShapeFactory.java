package factory.simplefactory;

import factory.common.Circle;
import factory.common.Shape;
import factory.common.Sqaure;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType.equals("Circle")) {
            return new Circle();
        } else if (shapeType.equals("Square")) {
            return new Sqaure();
        } else {
            throw new IllegalArgumentException("Shape not supported!");
        }
    }
}
