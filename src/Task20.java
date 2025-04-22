import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPerfectSquare = false;
        int sqrt = 0;

        if (num == 0) {
            isPerfectSquare = true;
        }
        else if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i * i == num) {
                    isPerfectSquare = true;
                    sqrt = i;
                    break;
                }

                if (i * i > num) {
                    break;
                }
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square (" + sqrt + " * " + sqrt + " = " + num + ").");
        } else {
            System.out.println(num + " is NOT a perfect square.");
        }

    }
}