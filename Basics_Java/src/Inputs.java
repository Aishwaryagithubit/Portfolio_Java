import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.print("Enter your ID: ");
        int id = s.nextInt();
        System.out.println("Name is " + name);
        System.out.println("ID is " + id);
        s.close(); // It's good practice to close the scanner
    }
}

