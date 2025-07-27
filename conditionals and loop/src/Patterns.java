import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Tri(5);


    }
    static void Tri(int t){
        //first half
        for(int i = 1; i<=t ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for(int i = t ; i>=1 ; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void MidTri(int t){
        for(int i = 1; i<=t ; i++){
            for(int j =1; j<=i ; j++ {
                
            })
        }
    }
}
