import java.util.Scanner;
public class Task6 {
    public static void main(String[]args){
        int x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        x = scanner.nextInt();

        if(x%2 == 0){
            System.out.println("The number is even ");
        }else{
            System.out.println("The number is odd ");
        }
    }
}
