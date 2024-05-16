import java.util.Scanner;

public class Day17_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your number : ");
        int number = sc.nextInt();
        int newNumber=reverseNum(number);
        System.err.println("The reversed number is "+newNumber);
        sc.close();

    }
    public static int reverseNum( int num){
        int digit;
        int reverse=0;
        while(num!=0){
            digit = num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
        return reverse;

    }
}
