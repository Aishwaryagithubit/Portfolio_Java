import java.util.Scanner;

public class Swapnum {
    public static void main(String[] args) {
     int output = swap();
        System.out.println(output);
    }
    static int swap(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num1 = s.nextInt();
        System.out.println("enter a num: ");
        int num2 = s.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        return temp;
    }
}
