import java.util.Scanner;

public class Day9_Q3 {
     public static void main(String[] args) {
          
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the number of rows here: ");
        int row= sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++){
                System.err.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.err.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.err.print(j+" ");
            }
            System.err.println();
        }
        
        sc.close();
    }
}
