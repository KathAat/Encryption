public class EncryptionDecryption {

    public static char intToAlphabet(int n) {
        if (n >= 1 && n <= 26) {
            return (char) ('a' + n - 1);
        } else {
            return '\0'; // Return null character for out-of-range input
        }
    }

    public static int alphabetToInt(char c) {
        if (c >= 'a' && c <= 'z') {
            return c - 'a';
        } else if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        } else {
            return -1; // non-alphabetic characters Return -1
        }
    }

    public static char intToSymbol(int n) {
        String symbols = "!@#$%^&*()_+=-[]{}|;:,.<>?";
        if (n >= 1 && n <= symbols.length()) {
            return symbols.charAt(n - 1);
        } else {
            return '\0'; // Return null character for out-of-range input
        }
    }

    public static int symbolToInt(char c) {
        String symbols = "!@#$%^&*()_+=-[]{}|;:,.<>?";
        int index = symbols.indexOf(c);
        return index;
    }

    public static String encrypt(String plaintext) {
        String encrypted = "";
        plaintext = plaintext.toLowerCase();

        for (char c : plaintext.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int index = alphabetToInt(c);
                if (index == -1) {
                    return "Error: Invalid Character";
                }
                char encryptedChar = intToSymbol(index + 1);
                encrypted += encryptedChar;
            } else {
                return "Error: Invalid Character";
            }
        }

        return encrypted;
    }

    public static String decrypt(String encrypted) {
        String decrypted = "";

        for (char c : encrypted.toCharArray()) {
            int index = symbolToInt(c);
            if (index == -1) {
                return "Error: Invalid Symbol";
            }
            char decryptedChar = intToAlphabet(index + 1);
            decrypted += decryptedChar;
        }

        return decrypted;
    }

    public static void main(String[] args) {
        String plaintext = "Dwags";
        String encrypted = encrypt(plaintext);
        System.out.println("Encrypted: " + encrypted);

        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
