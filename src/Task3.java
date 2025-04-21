import java.util.Scanner;
public class Task3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        if(num>0){
            System.out.println("The number is positive");
        }else if (num == 0){
            System.out.println("The number is zero");
        }else{
            System.out.println("The number is negative");
        }

    }
}
