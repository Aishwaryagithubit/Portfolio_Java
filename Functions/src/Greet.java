import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String output = greet();
        System.out.println(output);
    }

    static String greet(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = s.next();
        System.out.println("We're so glad you're here, " + name );
        return name;

    }
}
