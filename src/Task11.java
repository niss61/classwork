import java.util.Scanner;
public class Task11 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isPrime = true;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        if (num<=1){
             isPrime = false;

        }else for(int i = 2; i <=Math.sqrt(num); i++){
            if(num%i == 0){
                 isPrime = false;
            }
            break;
        }
        if (isPrime){
            System.out.println("Your number is prime");

        }else System.out.println("Your number is not prime.");
    }
}
