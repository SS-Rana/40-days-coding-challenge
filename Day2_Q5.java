import java.util.*;
public class Day2_Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter The Lenght in meter : ");
        double meter=sc.nextDouble();

        double feet=meter*3.37;

        System.out.println("The Lenght in feet is "+feet);
        sc.close();
    }
}
