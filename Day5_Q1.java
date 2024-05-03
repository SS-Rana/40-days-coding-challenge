import java.util.*;
public class Day5_Q1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.err.print("Enter the number here: ");
    int num=sc.nextInt();
    int factorial=1;

    for(int i=1; i<=num; i++){
        factorial*=i;
    }
   System.err.println("the factorial of entered number is "+factorial);
   sc.close();
        
    }
    
}