import java.util.Scanner;

public class Day22_Q2 {
    public static int  factorial (int num){
    if(num==1){
        return 1;
    }
    else{
        return num*factorial(num-1);
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number whose factorial is required: ");
        int num =sc.nextInt();
        System.err.printf("The factorial of %d num is %d ", num, factorial(num));
        sc.close();
    }
}
