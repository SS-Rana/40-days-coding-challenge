import java.util.Scanner;

public class Day24_Q1 {
    public static boolean isPrime(int number, int divisor) {
        if (number <= 1) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }

       
        return isPrime(number, divisor + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number : ");
        int num = sc.nextInt();
        if(isPrime(num, 2)){
            System.out.printf("The %d is a prime number",num);
        }
        else{
            System.out.printf("The %d is a not prime number",num);
            
        }
        sc.close();

    }
}
