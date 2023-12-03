package factory.simplefactory;

import factory.common.Shape;

public class SimpleFactoryPatternClient {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();

        Shape square = ShapeFactory.createShape("Square");
        square.draw();
    }
}
