package abstractfactory.factories;

import abstractfactory.items.Button;
import abstractfactory.items.TextField;
import abstractfactory.items.impl.DarkButton;
import abstractfactory.items.impl.DarkTextField;

public class DarkGUIFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}
