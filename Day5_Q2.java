import java.util.*;
public class Day5_Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your Number here: ");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            count++;
            num=num/10;
        }
        System.err.println("The number of digit present in the Entered Numer is "+count);
        sc.close();
    }
}
