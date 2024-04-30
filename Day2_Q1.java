import java.util.*;

public class Day2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        double pi=3.14;
        double perimeter= 2*radius*pi;
        double area=pi*radius*radius;


        System.out.println("The perimeter of Cirle is "+perimeter);
        System.out.println("The area of the circle is "+area);
        
        sc.close();
    }
}
