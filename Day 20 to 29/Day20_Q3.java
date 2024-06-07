import java.util.Scanner;

public class Day20_Q3 {
    public static void isPerfectNum(int num){
        int sum=0;
        for(int i=1; i<=num/2; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.printf("%d is a perfect number",num);
        }
        else{
            System.out.printf("%d is not a perfect number",num);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int num = sc.nextInt();
        isPerfectNum(num);
        sc.close();
    }
}
