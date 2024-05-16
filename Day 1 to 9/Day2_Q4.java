import java.util.*;
public class Day2_Q4 {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Principal amount here: ");
        Double p= sc.nextDouble();
        System.out.print("Enter the Time in year  here: ");
        Double year= sc.nextDouble();
        System.out.print("Enter the rate of Interest here: ");
        Double rate= sc.nextDouble();

        Double si=(p*rate*year)/100;

        System.out.println("The Simple Interest is "+si);

        sc.close();

    }
}
