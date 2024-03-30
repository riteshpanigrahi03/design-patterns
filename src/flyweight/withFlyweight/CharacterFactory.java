package flyweight.withFlyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, Character> characterCache = new HashMap<>();

    public static Character getCharacter(char charValue, String fontType) {
        String key = charValue + "_" + fontType;
        Character character = characterCache.get(key);
        if (character == null) {
            character = new Character(charValue, fontType);
            characterCache.put(key, character);
        }
        return character;
    }
}
