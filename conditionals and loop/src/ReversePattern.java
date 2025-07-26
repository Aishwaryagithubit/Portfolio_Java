import java.util.Scanner;

public class ReversePattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many rows: ");
        int rows = s.nextInt();
        for(int i=rows; i>=1 ;i--){
            for(int col = 1; col<=i; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
