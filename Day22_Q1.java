import java.util.Scanner;

public class Day22_Q1 {
    public static int hcf(int a, int b){
        if(b==0){
        return a;
        }
        else{
            return hcf( b , b%a);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the both  whose hcf is to be calculated : ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.printf("The hcf of %d and %d is %d",num1, num2, hcf(num1, num2));
        sc.close();
    }
}
