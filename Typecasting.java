import java.util.Scanner;

public class Typecasting {
   public static void main(String[]args){
       Scanner s = new Scanner(System.in);

       //automatic typecasting
       System.out.println("Enter a number");
       float num = s.nextInt(); // auto cast to float
       System.out.println("You entered (as float):" + num);

       // byte has 256
       byte b = 43;
       char c = 'a';
       short sh = 123;
       int i = 9000;
       float f = 5.36f;
       double d = 0.122;
       double result = (f*b) + (i/c)- (d-sh);

       System.out.println(f*b);
       System.out.println(i/c);
       System.out.println(d-sh);
       System.out.println(result);

       byte a = 100;
       byte e = 49;
       int output = (b*e)/a;
       System.out.println(output);

       //explicit typecasting
       int number = (int) (67.56f);
       System.out.println(number);

       // character to integer
       int num1 = 'A';
       System.out.println(num1);

   }
}
