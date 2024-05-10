import java.util.Scanner;

public class Day12_Q2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.err.println("Enter the row and column of matrix");
            int m= sc.nextInt(); 
            int n= sc.nextInt();
            
            int arr[][] = new int[m][n];

            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.println("Enter the element of "+(i+1)+" row and "+(j+1)+"column: ");
                    arr[i][j]= sc.nextInt();
                }
            }
            System.err.println("\nThe entered matrix");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.err.println();
            }
            System.err.println("\nThe diagonal matrix");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.err.print("  ");
                }
                }
                System.err.println();
            }
            System.err.println("\nThe Transpose Matrix");
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[j][i]+" ");
                }
                System.err.println();
            }
            sc.close();
    }
    
}
