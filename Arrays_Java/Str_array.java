import java.util.Arrays;
import java.util.Scanner;

public class Str_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter strings: ");
        //declare array name
        String [] str = new String[4];
        for(int i = 0;i<str.length;i++){
            //input array
             str[i] = s.next();
        }

        // converts to string and print string
        System.out.println(Arrays.toString(str));
        str[3] = "Dr. Jhatka";

        System.out.println(Arrays.toString(str));
    }


}
