package br.com.pedroco;

public class TesteCrypto {
    public static void main(String[] args) {
        try {
            String key = "1234567890123456"; // 16 bytes key
            String originalString = "Hello, World!";
            
            String encryptedString = Crypto.encrypt(originalString, key);
            String decryptedString = Crypto.decrypt(encryptedString, key);

            System.out.println("Original: " + originalString);
            System.out.println("Encrypted: " + encryptedString);
            System.out.println("Decrypted: " + decryptedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}