package flyweight.withFlyweight;

public class TextEditorWithFlyweight {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with a lot of repetition in it.";
        int row = 0;
        int column = 0;
        for (char c : sentence.toCharArray()) {
            Character charObj = CharacterFactory.getCharacter(c, "Arial");
            charObj.display(row, column);
            column++;
            if (c == ' ') {
                column = 0;
                row++;
            }
        }

        // Print total number of characters in the sentence
        System.out.println("Total characters: " + sentence.length());
        // Print total number of objects created
        System.out.println("Total objects created with Flyweight: " + Character.getObjectCreationCount());
    }
}

/** OUTPUT
 * Character: T, Font: Arial, Position: (0, 0)
 * Character: h, Font: Arial, Position: (0, 1)
 * Character: i, Font: Arial, Position: (0, 2)
 * Character: s, Font: Arial, Position: (0, 3)
 * Character:  , Font: Arial, Position: (0, 4)
 * Character: i, Font: Arial, Position: (1, 0)
 * Character: s, Font: Arial, Position: (1, 1)
 * Character:  , Font: Arial, Position: (1, 2)
 * Character: a, Font: Arial, Position: (2, 0)
 * Character:  , Font: Arial, Position: (2, 1)
 * Character: s, Font: Arial, Position: (3, 0)
 * Character: a, Font: Arial, Position: (3, 1)
 * Character: m, Font: Arial, Position: (3, 2)
 * Character: p, Font: Arial, Position: (3, 3)
 * Character: l, Font: Arial, Position: (3, 4)
 * Character: e, Font: Arial, Position: (3, 5)
 * Character:  , Font: Arial, Position: (3, 6)
 * Character: s, Font: Arial, Position: (4, 0)
 * Character: e, Font: Arial, Position: (4, 1)
 * Character: n, Font: Arial, Position: (4, 2)
 * Character: t, Font: Arial, Position: (4, 3)
 * Character: e, Font: Arial, Position: (4, 4)
 * Character: n, Font: Arial, Position: (4, 5)
 * Character: c, Font: Arial, Position: (4, 6)
 * Character: e, Font: Arial, Position: (4, 7)
 * Character:  , Font: Arial, Position: (4, 8)
 * Character: w, Font: Arial, Position: (5, 0)
 * Character: i, Font: Arial, Position: (5, 1)
 * Character: t, Font: Arial, Position: (5, 2)
 * Character: h, Font: Arial, Position: (5, 3)
 * Character:  , Font: Arial, Position: (5, 4)
 * Character: a, Font: Arial, Position: (6, 0)
 * Character:  , Font: Arial, Position: (6, 1)
 * Character: l, Font: Arial, Position: (7, 0)
 * Character: o, Font: Arial, Position: (7, 1)
 * Character: t, Font: Arial, Position: (7, 2)
 * Character:  , Font: Arial, Position: (7, 3)
 * Character: o, Font: Arial, Position: (8, 0)
 * Character: f, Font: Arial, Position: (8, 1)
 * Character:  , Font: Arial, Position: (8, 2)
 * Character: r, Font: Arial, Position: (9, 0)
 * Character: e, Font: Arial, Position: (9, 1)
 * Character: p, Font: Arial, Position: (9, 2)
 * Character: e, Font: Arial, Position: (9, 3)
 * Character: t, Font: Arial, Position: (9, 4)
 * Character: i, Font: Arial, Position: (9, 5)
 * Character: t, Font: Arial, Position: (9, 6)
 * Character: i, Font: Arial, Position: (9, 7)
 * Character: o, Font: Arial, Position: (9, 8)
 * Character: n, Font: Arial, Position: (9, 9)
 * Character:  , Font: Arial, Position: (9, 10)
 * Character: i, Font: Arial, Position: (10, 0)
 * Character: n, Font: Arial, Position: (10, 1)
 * Character:  , Font: Arial, Position: (10, 2)
 * Character: i, Font: Arial, Position: (11, 0)
 * Character: t, Font: Arial, Position: (11, 1)
 * Character: ., Font: Arial, Position: (11, 2)
 * Total characters: 57
 * Total objects created with Flyweight: 18
 */
