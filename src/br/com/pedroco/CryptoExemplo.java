package br.com.pedroco;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.Security;
import java.util.Base64;

public class CryptoExemplo {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static String encrypt(String input, String key) throws Exception {
        Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);
        byte[] encrypted = cipher.doFinal(input.getBytes());

        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String decrypt(String input, String key) throws Exception {
        Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding", "BC");
        
        cipher.init(Cipher.DECRYPT_MODE, aesKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(input));

        return new String(decrypted);
    }

    public static void main(String[] args) {
        try {
            String key = "1234567890123456"; // 16 bytes key
            String originalString = "Hello, World!";
            
            String encryptedString = encrypt(originalString, key);
            String decryptedString = decrypt(encryptedString, key);

            System.out.println("Original: " + originalString);
            System.out.println("Encrypted: " + encryptedString);
            System.out.println("Decrypted: " + decryptedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
