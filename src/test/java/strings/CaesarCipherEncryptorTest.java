package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherEncryptorTest {
    @Test
    void test() {
        var result = CaesarCipherEncryptor.caesarCypherEncryptor("xyz", 2);
        System.out.println(result);
    }

}