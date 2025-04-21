import java.util.Scanner;
class Task4{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int number1;
        System.out.println("Enter your number");
        number1 = scanner.nextInt();
        if (number1 %5 == 0 && number1 % 11==0){
            System.out.println("Your number is divisible by 5 and 11 both");
        }else{
            System.out.println("Your number is not divisible by 5 and 11");
        }
    }
}
