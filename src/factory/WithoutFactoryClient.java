package factory;

import factory.common.Circle;
import factory.common.Sqaure;
import factory.factorymethod.SquareFactory;

import java.util.Scanner;

public class WithoutFactoryClient {
    public static void main(String[] args) {
        String shape;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the shape to be created:");
        shape = scanner.nextLine();

        if (shape.equalsIgnoreCase("Circle")) {
            new Circle().draw();
        } else if (shape.equalsIgnoreCase("Square")) {
            new Sqaure().draw();
        }

    }
}
