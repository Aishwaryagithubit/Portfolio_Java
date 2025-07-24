import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = s.nextInt();

        // 4 digits to enter
        if(year>1000 && year<9999){
            if((year%4==0 && year%100!=0) || year%400==0){
                System.out.println(year + " is a Leap year");
            }
            else{
                System.out.println(year + " isnot a Leap year");
            }
        }
    }
}
