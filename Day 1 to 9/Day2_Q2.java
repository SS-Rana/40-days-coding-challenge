import java.util.*;
public class Day2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        int radius = sc.nextInt();
        System.out.print("Enter the height of the Cylinder: ");
        int height = sc.nextInt();
        double pi=3.14;
        double Surface_area= (2*pi*radius*height)+(2*pi*radius*radius);
        double volume= pi*radius*radius*height;
        System.out.println("The Surface area of Cylinder is "+Surface_area);
        System.out.println("The Volume of the Cylinder is "+volume);
        
        sc.close();
    }
}
