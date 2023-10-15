import java.util.ArrayList;
import java.util.Scanner;
class Encryption {
 ArrayList<Character> symbols = new ArrayList<Character>();
 ArrayList<Character> alphabets = new ArrayList<Character>();
 public Encryption() {
 symbols.add('!');
 symbols.add('@');
 symbols.add('#');
 symbols.add('$');
 symbols.add('^');
 symbols.add('&');
 symbols.add('*');
 symbols.add('(');
 symbols.add(')');
 symbols.add('_');
 symbols.add('-');
 symbols.add('+');
 symbols.add('=');
 symbols.add('?');
 symbols.add(',');
 symbols.add('{');
 symbols.add('}');
 symbols.add('[');
 symbols.add(']');
 symbols.add('/');
 symbols.add('|');
 symbols.add(';');
 symbols.add(':');
 symbols.add('.');
 symbols.add('<');
 symbols.add('>');
 for(char letter = 'a'; letter <= 'z'; letter++) {
 alphabets.add(letter);
 }
 }


 public class alphabets {
 public alphas() {
 symbols.add('a');
 symbols.add('b');
 symbols.add('c');
 symbols.add('d');
 symbols.add('e');
 symbols.add('f');
 symbols.add('g');
 symbols.add('h');
 symbols.add('i');
 symbols.add('j');
 symbols.add('k');
 symbols.add('l');
 symbols.add('m');
 symbols.add('n');
 symbols.add('o');
 symbols.add('p');
 symbols.add('q');
 symbols.add('r');
 symbols.add('s');
 symbols.add('t');
 symbols.add('u');
 symbols.add('v');
 symbols.add('w');
 symbols.add('x');
 symbols.add('y');
 symbols.add('z');
 for(char alpha = '!'; alpha <= '>'; alpha++) {
 symbols.add(alpha);
 }
 }
 public class returnindex() {
    









 }
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














 

















 

    
    

 




