import java.util.Scanner;

public class Temperature {
   public static void main(String[]args){
       Scanner s = new Scanner(System.in);
       System.out.println("Enter temperature in celsius: ");
       float tempc = s.nextFloat();
       float tempF = (tempc * 9/5) + 32;
       System.out.println(tempF+"F");
   }
}
