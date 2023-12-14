package abstractfactory.items.impl;

import abstractfactory.items.Button;

public class LightButton implements Button {
    @Override
    public void display() {
        System.out.println("Displayed LightButton!");
    }
}
