import java.util.Scanner;

public class Day24_Q2 {
    public static int sum(int num){
        if(num==0){
            return 0;
        }
        else{
            return num%10 + sum(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the  number : ");
        int num = sc.nextInt();
        System.err.printf("The sum of digit of %d is %d",num,sum(num));
        sc.close();
    }
}
