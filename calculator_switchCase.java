import com.sun.jdi.CharType;

import java.util.Scanner;

public class calculator_switchCase {

    public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bitte geben Sie die erste Zahl ein");
    double zahl1 = scanner.nextDouble();

    System.out.println("Bitte geben Sie die zweite Zahl ein:");
    double zahl2 = scanner.nextDouble();

    System.out.println("Bitte Geben Sie die Operation ein:");
    char operation = scanner.next().charAt(0);

    // calculator operations: +,-,/,*

    switch (operation) {
        case '+':
            System.out.println("Antwort: " + (zahl1 + zahl2));
            break;
        case '-':
            System.out.println("Antwort: " + (zahl1 - zahl2));
            break;
        case '/':
            System.out.println("Antwort: " + (zahl1 / zahl2));
            break;
        case '*':
            System.out.println("Antwort: " + (zahl1 * zahl2));
            break;
    }


    }
}
