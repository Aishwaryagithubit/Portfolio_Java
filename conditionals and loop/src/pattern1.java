import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter num of times: ");
        int n= s.nextInt();
        for(int row = 1; row<=n; row++){
            // for every, row run col
            for(int col = 1; col <= n ; col++){
                System.out.print("*");
            }
            // when row is printed , we need new to add line
            System.out.println();

        }
    }
}
