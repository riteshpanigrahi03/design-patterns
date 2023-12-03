package factory.factorymethod;

import factory.common.Shape;
import factory.common.Sqaure;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Sqaure();
    }
}
