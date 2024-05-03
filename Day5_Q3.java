import java.util.*;

public class Day5_Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your Number here: ");
        int num=sc.nextInt();
        int num1;
        int sum=0;
        while(num!=0){
            num1=num%10;
            num=num/10;
            sum+=num1;
        }
        System.err.println("The number of digit present in the Entered Numer is "+sum);
        sc.close();
    }
}
