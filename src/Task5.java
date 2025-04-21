import java.util.Scanner;
public class Task5 {
    public static void main(String[]args){
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        a = scanner.nextInt();

        System.out.println("Enter the second number ");
        b = scanner.nextInt();

        System.out.println("Enter the third number ");
        c = scanner.nextInt();

        if(a>b && a>c){
            System.out.println("The first number is the greatest");
        }else if( b>a && b>c){
            System.out.println("The second number is the greatest");
        }else{
            System.out.println("The third number is the greatest");
        }
    }
}
