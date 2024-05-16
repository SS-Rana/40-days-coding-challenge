import java.util.Scanner;

public class Day9_Q4 {
    public static void main(String[] args) {
          
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter the number of rows here: ");
        int row= sc.nextInt();

        for (int i = 0; i < row; i++) {
            int count = 1;
            for (int j = 0; j < row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                
                System.out.print(count+"  ");
                count = count * (i - j) / (j + 1);
            }
            System.out.println();
        
        sc.close();
    }
}
}
