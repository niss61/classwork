import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        for(; num > 0; num /= 10) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        System.out.println("Original number: " + originalNum);
        System.out.println("Reversed number: " + reversedNum);

    }
}