
import java.util.Scanner;

public class Day3_Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the day of the month: ");
        int day=sc.nextInt();
        int n=day%7;
        if(day>=1 && day<=31){
            switch (n) {
                case 1:
                System.out.println("Wednesday");
                break;
                case 2:
                System.out.println("Thrusday");
                break;
                case 3:
                System.out.println("Friday");
                 break;
                case 4:
                System.out.println("Saturday");
                break;
                case 5:
                System.out.println("Sunday");
                case 6:
                System.out.println("Monday");
                break;
                default:
                System.out.println("Tuesday");
                    break;
            }
        }
        else{
            System.out.println("invalid input");
        }
        sc.close();
    }
}
