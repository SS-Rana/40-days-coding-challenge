import java.util.Scanner;

public class Day7_Q2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num = sc.nextInt();

       for(int i=0; i<num; i++){
        for(int j=0; j<num-i-1; j++){
            System.err.print(" ");
        }
        for(int k=0; k<num; k++){
            System.err.print("* ");
        }
       
        System.err.println();
       }  
        sc.close();
    }
}
