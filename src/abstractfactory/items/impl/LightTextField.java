package abstractfactory.items.impl;

import abstractfactory.items.TextField;

public class LightTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Displayed LightTextField!");
    }
}
