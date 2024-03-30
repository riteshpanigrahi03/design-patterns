package flyweight.withoutFlyweight;

public class Character {
    private static int objectCreationCount = 0; // Static counter to track object creations
    private char charValue;
    private String fontType;
    private int row;
    private int column;

    public Character(char charValue, String fontType, int row, int column) {
        this.charValue = charValue;
        this.fontType = fontType;
        this.row = row;
        this.column = column;
        objectCreationCount++; // Increment counter on each object creation
    }

    public void display() {
        System.out.println("Character: " + charValue + ", Font: " + fontType + ", Position: (" + row + ", " + column + ")");
    }

    public static int getObjectCreationCount() {
        return objectCreationCount;
    }
}

