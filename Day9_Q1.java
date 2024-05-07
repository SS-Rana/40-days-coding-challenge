import java.util.Scanner;

public class Day9_Q1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the number of rows here: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.err.print("* ");
            }
            for(int j=1; j<=2*(row-i); j++){
                System.err.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.err.print("* ");
            }
            System.err.println();
        }
        for(int i=row; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.err.print("* ");
            }
            for(int j=1; j<=2*(row-i); j++){
                System.err.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.err.print("* ");
            }
            System.err.println();
        }
        sc.close();
    }
}