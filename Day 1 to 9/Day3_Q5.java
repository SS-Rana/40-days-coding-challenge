import java.util.*;

public class Day3_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficients of quadratic equation (a, b, c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double root1;
        double root2;

        double d=b*b-4*a*c;
        if(d>=0){
             root1= (-b+ Math.sqrt( d))/2*a;
             root2= (-b- Math.sqrt(d))/2*a;
             System.err.println("the roots of the quadratic equation are "+root1+" and " +root2);

        }
        else {
            System.err.println("the roots are imaginary");
            
        }

        sc.close();
    }
}
