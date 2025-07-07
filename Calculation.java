import java.util.Scanner;

public class Calculation {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = s.nextInt();
        System.out.println("Enter a number: ");
        int num2 = s.nextInt();
        int sum = num1 + num2 ;
        int sub = num1 - num2 ;
        int multi = num1 * num2 ;
        int div = num1 / num2 ;
        int rem_div = num1 % num2 ;

        System.out.println("Sum of" + num1 + "and"+ num2 +"is"+ sum);
        System.out.println("Substraction of" + num1 + "and"+ num2 +"is"+ sub);
        System.out.println("Multiplication of" + num1 + "and"+ num2 +"is"+ multi);
        System.out.println("Division of" + num1 + "and"+ num2 +"is"+ div);
        System.out.println("Remainder division of" + num1 + "and"+ num2 +"is"+ rem_div);
    }
}
