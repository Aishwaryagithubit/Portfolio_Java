import java.util.Scanner;

public class Numloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = s.nextInt();

       //print 1 to n
        /*
        for( int num=1 ; num<=n; num+=1){
           System.out.println(num);
        System.out.println("Aishwarya");
      }
         */

       /*while loop
        int num = 1;
        while(num<=n){
            System.out.println(num);
             num++;
        }   */

        //do while loop
        int num=1;
        do{
            System.out.println(num);
            num++;
        }while(num<=n);
    }
}
