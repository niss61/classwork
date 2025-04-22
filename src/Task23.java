import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum = 0;

        if (num < 0) {
            System.out.println(num + " is not a palindrome (negative numbers are not considered palindromes).");
            return;
        }

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            reversedNum = reversedNum * 10 + digit;
        }

        if (num == reversedNum) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

    }
}