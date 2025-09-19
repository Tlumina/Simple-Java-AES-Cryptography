import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class SimpleCryptography {
    public static void main (String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Simple Cryptography: Securing your data.");
        System.out.println("1. Encrypting ");
        System.out.println("2. Decrypting ");
        System.out.print("Which do you choose: 1 or 2 - ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            // Encryption
            System.out.print("Enter your information to be encrypted: ");
            String plainText = scanner.nextLine();

            // Generate AES key
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            SecretKey aesKey = keyGen.generateKey();

            // Encrypt
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

            // Encode key
            String encodedKey = Base64.getEncoder().encodeToString(aesKey.getEncoded());

            System.out.println("Your Encrypted information: " + encryptedText);
            System.out.println("Encrypted AES key (save this to decrypt later): " + encodedKey);

        } else if (choice == 2) {
            // Decryption
            System.out.print("Enter your encrypted information to be decrypted: ");
            String encryptedText = scanner.nextLine();
            System.out.print("Enter the Encrypted AES key: ");
            String encodedKey = scanner.nextLine();

            // Rebuild key
            byte[] decodedKey = Base64.getDecoder().decode(encodedKey);
            SecretKey originalKey = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, originalKey);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));

            System.out.println("Your Decrypted information: " + new String(decryptedBytes));
        } else {
            System.out.println("Invalid choice. Pick either 1 or 2.");
        }

        scanner.close();
    }
}
