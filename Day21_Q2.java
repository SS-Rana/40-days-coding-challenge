import java.util.Scanner;

public class Day21_Q2 {
    public static int sum(int num){
       
        if(num==1){
            return 1;
        }
        else{
            return num+sum(num-1);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.err.print("Enter the no of term you want to add up to : ");
        int num = sc.nextInt();
        System.out.println("The sum of "+num+" natural number is "+sum(num));
        sc.close();
    }
}
