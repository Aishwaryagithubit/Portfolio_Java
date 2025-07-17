import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
      //  int output = sum2();
        //System.out.println(output);

        int output = sum3(2,3);
        System.out.println(output);
    }

    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }

    static int sum2(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = s.nextInt();
        System.out.println("enter a number: ");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num1 = s.nextInt();
        System.out.println("enter a number: ");
        int num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of "+ num1 + " and " + num2 + " is " + sum);

    }
}
