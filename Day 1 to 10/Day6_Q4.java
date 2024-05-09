import java.util.Scanner;

public class Day6_Q4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num= sc.nextInt();
        int prime=0;
        
       for(int i=2; i<=num/2; i++){
        if(num%i==0){
           prime=1;
            break;
        }
       
        }
        if(prime==0 && num > 1){
            System.err.println("The entered number is a prime number.");
        } else {
            System.err.println("The entered number is not a prime number.");
        }
        sc.close();
       }
       
    }

