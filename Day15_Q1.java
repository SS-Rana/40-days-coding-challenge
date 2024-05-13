import java.util.Scanner;

public class Day15_Q1 {
    public static void table( int num){
        System.err.println("The Table of "+num+" :");
        for(int i=1; i<=10; i++){
            System.err.printf(" %d X %d : %d \n",i, num, i*num);
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.err.print("Enter the number whose tabele you want to print : ");
       int num = sc.nextInt();
       table(num);
       sc.close();
        }
    }

