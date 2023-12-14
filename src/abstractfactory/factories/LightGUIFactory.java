package abstractfactory.factories;

import abstractfactory.items.Button;
import abstractfactory.items.TextField;
import abstractfactory.items.impl.LightButton;
import abstractfactory.items.impl.LightTextField;

public class LightGUIFactory extends GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}
