import java.util.Scanner;

public class Day6_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num= sc.nextInt();
        int digit;
        int num1=num;
        int revnum=0;
        
        while( num!=0){
            digit=num%10;
            num=num/10;
            revnum=revnum*10+digit;
        }
        if(revnum==num1){
            System.err.println("the Entered number "+num1+" is a palindrome");
        }
        else{
            System.err.println("the Entered number "+num1+" is not  a palindrome");

        }
        sc.close();
    }
}
