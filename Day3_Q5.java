import java.util.Scanner;

public class Day3_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients of quadratic equation (a, b, c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the equation are: " + root1 + " and " + root2);
        } 
        else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Root of the equation is: " + root1);
        } 
        else {
            System.out.println("The root are imaginary");
        }
        sc.close();
    }
}
