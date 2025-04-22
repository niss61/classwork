import java.util.Scanner;
public class Task15 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int fac = 1;
        System.out.println("Enter your number");
        num = scanner.nextInt();
        for(int i = 1; i<=num; i++){
            fac *=i;
        }
        System.out.println(fac);
    }
}
