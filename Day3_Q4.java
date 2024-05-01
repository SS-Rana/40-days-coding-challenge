import java.util.*;

public class Day3_Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 0 for addition, 1 for multiplication, 2 for subtraction, 3 for division"); 
        int n = sc.nextInt();
        System.out.println("Enter the two numbers here ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c;
        
        switch (n) {
            case 0:
                c = a + b; 
                break;
            case 1:
                c = a * b;
                break;
            case 2:
                c = a - b;
                break;
            case 3:
               
                c = a / b;
            
                break;
            default:
                System.out.println("Invalid Result");
               return;
               
        }
        
        System.out.println("Result: " + String.format("%.2f", c));
        sc.close();
    }
}
