import java.util.Scanner;

public class CipherEncryptionAndDecryption {
    static int key = 6;
    static char[] chars;
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        System.out.println("welcome to encryption and decryption programm");
        System.out.println("choose an option: ");
        System.out.println("1. Encrypt text");
        System.out.println("2. Decrypt text");
        System.out.println("3. Exit");
    }


    static void encrypt() {
        for (char c : chars) {
            c += key;
            System.out.print(c);
        }
    }

    static void decrypt() {
        for (char c : chars) {
            c -= key;
            System.out.print(c);
        }
    }


    public static void main(String [] args) {
        String text = ("Test tesxt");
        char [] chars = text.toCharArray();



    }

    }

