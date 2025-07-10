import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num1 = s.nextInt();
        System.out.println("Enter a num: ");
        int num2 = s.nextInt();
        System.out.println("Enter a num: ");
        int num3 = s.nextInt();

        //largest
        int largest = num1;
        if(num2>largest){
            largest = num2;
        }
        if(num3>largest){
            largest = num3;
        }
        System.out.println("Largest number: "+ largest);

         /* find max

        int max = Math.max(num3,Math.max(num1,num2));
        System.out.println(max);  */
    }


}
