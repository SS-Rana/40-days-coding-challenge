import java.util.Scanner;

public class Day20_Q1 {
   public static int  factorial (int num){
    int result = 1;
        for(int i = 1; i<=num; i++ ){
            result *= i;
        }
        return result;
   }
   public static int  seriesSum(int num){
    int sum=0;
    for(int i = 1; i<=num; i++ ){
        sum+=factorial(i)/i;
    }
    return sum;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of term : ");
        int num = sc.nextInt();
        System.out.println("The series till "+num+" term  : ");
        for(int i=1; i<=num; i++){
            System.out.printf("%d \t", factorial(i)/i);
        }
        System.err.printf("\nThe  sum of the given series is %d ",  seriesSum(num));

        sc.close();
    }
}