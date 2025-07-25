public class Pattern {
    public static void main(String[] args) {

        for(int i=1 ; i<=6 ; i++){
            for(int j=1; j<=i ; j++){
                // print on same line
                System.out.print("*");
            }
            // move to next line
            System.out.println();
        }
    }
}
