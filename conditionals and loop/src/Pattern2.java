import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num: ");
        Numpattern(4);
        ReverseNum(5);
    }

      static void Numpattern(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<=i ; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }


      }

      static void ReverseNum(int n){
        for(int i = n; i>=1 ; i--){
            for(int j = 1; j<=i ; j++ ){
                System.out.print(j);
            }
            System.out.println();

        }
      }


}
