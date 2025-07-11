import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter numbers to reverse: ");
        int num = s.nextInt();
        int ans = 0;

        while(num>0){
            int rem = num%10;
            num = num/10;
            ans = ans*10 + rem;
        }
        System.out.println("Reverse of your number:"+ ans);
    }
}
