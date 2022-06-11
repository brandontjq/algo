package strings;

public class CaesarCipherEncryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            int convertedCharacterInt = (int) character + key > 122 ? 96 + (((int) character + key) % 122) : (int) character + key;
            char convertedCharacter = (char) convertedCharacterInt;
            sb.append(convertedCharacter);

        }
        return sb.toString();
    }
}
