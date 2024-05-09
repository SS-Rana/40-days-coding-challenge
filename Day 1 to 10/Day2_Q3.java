import java.util.*;

public class Day2_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c=(f-32)*0.556;

        System.err.println("The temperature in Celcius is "+c);
        sc.close();
    }
}
