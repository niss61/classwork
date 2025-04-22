import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            long n = number;
            do {
                n /= 10;
                count++;
            } while (n != 0);
        }
        System.out.println("Number of digits in " + number + ": " + count);
    }
}

