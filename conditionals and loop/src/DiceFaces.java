import java.util.Scanner;

public class DiceFaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number for dice: ");
        int n = s.nextInt();
        findFaces(n);
    }
    // outside of main
    static void findFaces(int n){
        int ans = 7 - n;
        System.out.println("Opposite number of dice is: "+ ans);
    }

}
