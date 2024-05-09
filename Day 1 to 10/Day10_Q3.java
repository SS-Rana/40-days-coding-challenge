import java.util.Scanner;

public class Day10_Q3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the Size of your array :");
        int size = sc.nextInt();
        int Marks[]= new int[size];
        System.err.println("Enter the element of your array  ");

        for(int i=0; i<size; i++){
           Marks[i] = sc.nextInt();
        }
        System.err.print("\nThe Element of array in reverse order :");
        
        for(int i=size-1; i>=0; i--){
            System.err.print(Marks[i]+" ");
        }
        sc.close();
    }
}
