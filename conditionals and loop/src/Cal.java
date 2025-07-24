import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter choice (1/2/3/4/5): ");
        char choice = s.next().trim().charAt(0);

        System.out.println("enter a number: ");
        float num1 = s.nextFloat();
        System.out.println("enter a number: ");
        float num2 = s.nextFloat();
        switch(choice){

            case '1':
                System.out.println("output: "+ (num1+num2));
                break;
            case '2':
                System.out.println("output:"+ (num1-num2));
                break;
            case '3':
                System.out.println("output: "+ (num1*num2));
                break;
            case '4':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            case '5':
                System.out.println("output: "+ (num1%num2));
                break;
            default:
                System.out.println("Invalid choice!!");

        }

    }
}
