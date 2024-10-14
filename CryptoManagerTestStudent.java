package crypto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

    @Test
    void testCaesarEncryption() {
        String plainText = "HELLO";
        int key = 3;
        String encrypted = CryptoManager.caesarEncryption(plainText, key);
        assertEquals("KHOOR", encrypted);
    }

    @Test
    void testCaesarDecryption() {
        String encryptedText = "KHOOR";
        int key = 3;
        String decrypted = CryptoManager.caesarDecryption(encryptedText, key);
        assertEquals("HELLO", decrypted);
    }

    @Test
    void testBellasoEncryption() {
        String plainText = "HELLO";
        String bellasoStr = "KEY";
        String encrypted = CryptoManager.bellasoEncryption(plainText, bellasoStr);
        assertEquals("RIJVS", encrypted);
    }

    @Test
    void testBellasoDecryption() {
        String encryptedText = "RIJVS";
        String bellasoStr = "KEY";
        String decrypted = CryptoManager.bellasoDecryption(encryptedText, bellasoStr);
        assertEquals("HELLO", decrypted);
    }
}
