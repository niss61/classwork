import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }
        System.out.println("Sum of digits of  is: " + sum);
    }
}