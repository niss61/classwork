import java.util.Scanner;
public class Task12 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(num + " × " + i + " = " + (num * i));
        }
    }
}
