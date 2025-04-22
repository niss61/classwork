import java.util.Scanner;
public class Task13 {
    public static void main(String[]args){
        Scanner scanner =  new  Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Enter a natural number");
        n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            sum +=i;
        }
        System.out.println("The sum of natural numbers is " + sum);

    }
}
