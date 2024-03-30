package flyweight.withFlyweight;

public class Character {
    private static int objectCreationCount = 0; // Static counter to track object creations
    private char charValue;
    private String fontType;

    public Character(char charValue, String fontType) {
        this.charValue = charValue;
        this.fontType = fontType;
        objectCreationCount++; // Increment counter on each object creation
    }

    public void display(int row, int column) {
        System.out.println("Character: " + charValue + ", Font: " + fontType + ", Position: (" + row + ", " + column + ")");
    }

    public static int getObjectCreationCount() {
        return objectCreationCount;
    }
}

