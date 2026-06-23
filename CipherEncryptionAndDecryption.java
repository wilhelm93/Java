import java.util.Scanner;

public class CipherEncryptionAndDecryption {
    static int key = 6;
    static char[] chars;
    static Scanner scanner = new Scanner(System.in);

    static void menu() {
        while(true) {
            System.out.println("\n" + "welcome to encryption and decryption programm");
            System.out.println("choose an option: ");
            System.out.println("1. Encrypt text");
            System.out.println("2. Decrypt text");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            boolean running = true;
            switch (option) {
                case 1:
                    System.out.println("Enter text to encrypt: ");
                    String text = scanner.nextLine();
                    chars = text.toCharArray();
                    encrypt();
                    break;

                case 2:
                    System.out.println("Enter text to decrypt: ");
                    text = scanner.nextLine();
                    chars = text.toCharArray();
                    decrypt();
                    break;

                case 3:
                    running = false;
            }
        }


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
        menu();

    }

}

