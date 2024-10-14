package crypto;

public class CryptoManager {

    private static final char LOWER_RANGE = ' ';  // ASCII value 32
    private static final char UPPER_RANGE = '_';  // ASCII value 95
    private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

    // Method to check if the string is within ASCII bounds
    public static boolean isStringInBounds(String plainText) {
        for (int i = 0; i < plainText.length(); i++) {
            if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE) {
                return false;
            }
        }
        return true;
    }

    // Caesar Encryption
    public static String caesarEncryption(String plainText, int key) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds. Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int shifted = ch + key;

            // Wrap around if the shifted value exceeds the upper range
            while (shifted > UPPER_RANGE) {
                shifted -= RANGE;
            }

            encryptedText.append((char) shifted);
        }
        return encryptedText.toString();
    }

    // Caesar Decryption
    public static String caesarDecryption(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            int shifted = ch - key;

            // Wrap around if the shifted value is less than the lower range
            while (shifted < LOWER_RANGE) {
                shifted += RANGE;
            }

            decryptedText.append((char) shifted);
        }
        return decryptedText.toString();
    }

    // Bellaso Encryption
    public static String bellasoEncryption(String plainText, String bellasoStr) {
        if (!isStringInBounds(plainText)) {
            return "The selected string is not in bounds. Try again.";
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());
            int shifted = ch + keyChar;

            // Wrap around if the shifted value exceeds the upper range
            while (shifted > UPPER_RANGE) {
                shifted -= RANGE;
            }

            encryptedText.append((char) shifted);
        }
        return encryptedText.toString();
    }

    // Bellaso Decryption
    public static String bellasoDecryption(String encryptedText, String bellasoStr) {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < encryptedText.length(); i++) {
            char ch = encryptedText.charAt(i);
            char keyChar = bellasoStr.charAt(i % bellasoStr.length());
            int shifted = ch - keyChar;

            // Wrap around if the shifted value is less than the lower range
            while (shifted < LOWER_RANGE) {
                shifted += RANGE;
            }

            decryptedText.append((char) shifted);
        }
        return decryptedText.toString();
    }
}
