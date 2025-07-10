import java.util.Scanner;

public class CheckSalary {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your salary: ");
        int salary = s.nextInt();
        if(salary>100000){
            salary +=5000;
        }
        else if (salary>10000){
            salary +=2000;
        }
        else{
           salary +=1000;
        }

        System.out.println("You recieved salary with bonus:" + "Rs"+salary);
    }
}
