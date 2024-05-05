import java.util.Scanner;

public class Day7_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num = sc.nextInt();

       for(int i=0; i<=num; i++){
        for(int j=num; j>=i; j--){
            System.err.print(" ");
        }
        for(int k=0; k<i; k++){
            System.err.print("* ");
        }
        System.err.println();
       }  
        sc.close();
    }
}
