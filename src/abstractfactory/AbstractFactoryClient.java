package abstractfactory;

import abstractfactory.factories.GUIFactory;
import abstractfactory.items.Button;
import abstractfactory.items.TextField;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        GUIFactory guiFactory = GUIFactory.getFactory("Dark");
        Button button = guiFactory.createButton();
        TextField textField = guiFactory.createTextField();
        button.display();;
        textField.display();
    }
}
