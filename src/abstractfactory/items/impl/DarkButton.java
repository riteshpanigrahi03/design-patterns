package abstractfactory.items.impl;

import abstractfactory.items.Button;

public class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Displayed DarkButton!");
    }
}
