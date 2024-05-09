import java.util.*;

public class Day4_Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any three numbers here");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int largest=num1;
        if(largest<num2){
            largest=num2;
        }
        if(largest<num3){
            largest=num3;
        }
        System.out.println("the largest number is "+largest);
        sc.close();
    }
}
