import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your income in lakh");
        float income = s.nextFloat();
        if(income>=2.5 && income<5.0){
            System.out.println("pay tax 5%"+ "for" + income+"L");
        }
        else if(income>=5.0 && income<10.0){
            System.out.println("pay tax 20%"+ "for" + income+"L");
        }
        else if(income>=10.0){
            System.out.println(" pay tax 30%"+ "for" + income+"L");
        }
        else{
            System.out.println("No tax enjoy!!");
        }

    }
}

