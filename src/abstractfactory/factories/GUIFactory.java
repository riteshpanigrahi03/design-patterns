package abstractfactory.factories;

import abstractfactory.items.Button;
import abstractfactory.items.TextField;

//Abstract Factory
public abstract class GUIFactory {
    public abstract Button createButton();
    public abstract TextField createTextField();
    public static GUIFactory getFactory(String theme) {
        switch (theme) {
            case "Light":
                return new LightGUIFactory();
            case "Dark":
                return new DarkGUIFactory();
            default:
                break;
        }
        return null;
    }
}
