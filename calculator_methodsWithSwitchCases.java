import java.util.Scanner;

public class calculator_methodsWithSwitchCases{
    public static void main (String [] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bitte geben Sie die erste Zahl ein: ");
    double a = scanner.nextDouble();
    System.out.println("Bitte geben Sie die zweite Zahl ein: ");
    double b = scanner.nextDouble();

    System.out.println("Bitte geben Sie die Operation ein: ");

    char Antwort = scanner.next().charAt(0);

    switch (Antwort) {
        case '+':
            System.out.println("Antwort: " + addition(a, b));
            break;
        case '-':
            System.out.println("Antwort: " + subtraktion(a, b));
            break;
        case '/':
            System.out.println("Antwort: " + division(a, b));
            break;
        case '*':
            System.out.println("Antwort: " + multiplikation(a, b));
            break;
        default:
            System.out.println("Bitte geben Sie eine gültige Operation ein. +, -, / oder *");
    }

    }

//methods: Addition, Subtraktion, Division, Multiplikation
    public static double addition (double a, double b) {
        return a + b;
    }
    public static double subtraktion (double a, double b) {
        return a - b;
    }
    public static double division (double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
    public static double multiplikation (double a, double b){
        return a * b;
    }
}
