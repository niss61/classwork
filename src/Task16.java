import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("The result of " + num1 + " + " + num2 + " is: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("The result of " + num1 + " * " + num2 + " is: " + result);
                break;

            case '/':
                if (num2 != 0) {  // Check to prevent division by zero
                    result = num1 / num2;
                    System.out.println("The result of " + num1 + " / " + num2 + " is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator entered.");
                break;
        }

    }
}

