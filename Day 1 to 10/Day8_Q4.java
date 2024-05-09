import java.util.Scanner;

public class Day8_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num = sc.nextInt();

       for(int i=1; i<=num; i++){
        for(int j=1; j<=num-i; j++){
            System.err.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
       }
       
       for(int i=1; i<=num-1; i++){
        for(int j=1; j<=i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=num-i; j++){
            System.out.print("* ");
        }
        System.err.println();
       }
        sc.close();
}
}
