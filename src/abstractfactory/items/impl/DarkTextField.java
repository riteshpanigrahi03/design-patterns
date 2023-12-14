package abstractfactory.items.impl;

import abstractfactory.items.TextField;

public class DarkTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Displayed DarkTextField!");
    }
}
