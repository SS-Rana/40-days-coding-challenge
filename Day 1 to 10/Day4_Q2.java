import java.util.*;
public class Day4_Q2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter the Length of three sides ");
         int side1=sc.nextInt();
         int side2=sc.nextInt();
         int side3=sc.nextInt();

         if(side1+side2>side3|| side2+side3>side1 || side3+side1>2){
            System.out.println("The three sides  will form a triangle");
         }
         else{
            System.out.println("The three sides will not form a triangle");
         }

         sc.close();
    }
}
