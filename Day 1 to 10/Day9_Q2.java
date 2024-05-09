import java.util.Scanner;

public class Day9_Q2 {
    public static void main(String[] args) {
          
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the number of rows here: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.err.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.err.print(i+" ");
            }
            System.err.println();
        }
        
        sc.close();
    }
}

