import java.util.Scanner;
public class Task7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }else System.out.println("Your are ineligible to vote.");
    }

}
