import java.util.Scanner;

public class Day7_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num = sc.nextInt();

       for(int i=0; i<num; i++){
        for(int j=num; j>i; j--){
            System.err.print("* ");
        }
        System.err.println();
       }  
        sc.close();
    }
}
