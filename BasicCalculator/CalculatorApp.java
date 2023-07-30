package BasicCalculator;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Enter operator (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("Enter the first integer value: ");
        int value1 = scanner.nextInt();

        System.out.print("Enter the second integer value: ");
        int value2 = scanner.nextInt();

        try {
            int result = MathOperations.basicMath(operator, value1, value2);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
}

