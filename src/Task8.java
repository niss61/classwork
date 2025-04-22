import java.util.Scanner;
public class Task8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String letter;

        System.out.println("Enter a letter: ");
        letter = scanner.nextLine();

        if(letter.equals("a")|| letter.equals("e") || letter.equals("i") || letter.equals("o")|| letter.equals("u")){
            System.out.println("Your letter is a vowel.");
        }else System.out.println("Your letter is a consonant");
    }
}
