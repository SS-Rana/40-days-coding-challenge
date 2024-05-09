import java.util.*;

public class Day6_Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num= sc.nextInt();
        int digit;
        int sum=0;
        int num1=num;
        
        while( num!=0){
            digit=num%10;
            num=num/10;
            sum+=Math.pow(digit, 3);
           
        }
        if(sum==num1){
            System.err.println("The number " +num1+ " is a Armstrong");
        }
        else{
            System.err.println("The number "+num1+" is not a Armstrong");
        }
        sc.close();
    }
}
