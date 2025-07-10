import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;   //previous
        int b = 1;  //current
        int count = 2;

        while(count<=2){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
