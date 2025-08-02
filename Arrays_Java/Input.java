import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 6 numbers: ");
        int [] arr = new int [6];

        for(int i = 0; i < arr.length;i++){
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i] + " ");
        }
    }
}

