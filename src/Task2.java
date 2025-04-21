import java.util.Scanner;
public class Task2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Enter first number");
        x = scanner.nextInt();

        System.out.println("Enter second number");
        y = scanner.nextInt();

        int sum = x+y;
        int diff = x-y;
        int quot = x%y;
        int pro = x*y;

        System.out.println("The sum of two numbers is  " + sum);
        System.out.println("The difference of two numbers is  "+diff);
        System.out.println("The product of two numbers is  "+ pro);
        System.out.println("The quotient of two numbers is  "+ quot);


    }

}
