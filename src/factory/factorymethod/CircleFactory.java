package factory.factorymethod;

import factory.common.Circle;
import factory.common.Shape;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
