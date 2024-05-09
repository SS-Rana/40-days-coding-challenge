import java.util.*;
public class Day3_Q2 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter your number: ");
    int num=sc.nextInt();
    String check=(num%2==0)?"even":"odd";

    System.out.println(num+ " is "+ check );

    sc.close();

    }
}