import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your word: ");
        char ch = s.nextLine().trim().charAt(0);

        if(ch >='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
