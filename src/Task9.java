import java.util.Scanner;
public class Task9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;

        System.out.println("Enter the marks from first subject: ");
        sub1 = scanner.nextInt();

        System.out.println("Enter the marks from second subject: ");
        sub2 = scanner.nextInt();

        System.out.println("Enter the marks from third subject: ");
        sub3 = scanner.nextInt();

        System.out.println("Enter the marks from fourth subject: ");
        sub4 = scanner.nextInt();

        System.out.println("Enter the marks from fifth subject: ");
        sub5 = scanner.nextInt();

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percent = (total / 500.0) * 100;

        String grade;


        if(percent >=90){
            System.out.println("You got " +percent+ " and grade A");

        }else if( percent >= 80){
            System.out.println("You got " + percent+ " and grade B");

        }else if (percent >= 60){
            System.out.println("You got " + percent+ " and grade C");

        }else System.out.println("You got " + percent + "a nd no assigned grade");

    }
}
