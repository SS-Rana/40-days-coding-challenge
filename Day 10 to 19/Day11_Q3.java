import java.util.Scanner;

public class Day11_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number of terms of fibonacci: ");
        int num = sc.nextInt();
        int first=0;
        int second=1;
        int arr[] = new int[num];

        for(int i=0; i<num; i++){
            arr[i]= first+second;
            first=second;
            second = arr[i];
        }
        System.err.print(num+" terms of fibonacci series : 0 1 ");
        for(int i=0; i<num; i++){
            System.err.print(arr[i]+" ");
        }
        sc.close();
    }
}
