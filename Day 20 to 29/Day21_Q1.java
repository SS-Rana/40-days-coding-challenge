import java.util.Scanner;

public class Day21_Q1 {
    public static void naturalNum(int num){
        if(num>0){
            naturalNum(num-1);
            System.err.print(num+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the no of term you want to print ");
        int num = sc.nextInt();
        naturalNum(num);
        sc.close();
    }
}
