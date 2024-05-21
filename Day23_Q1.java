import java.util.Scanner;

public class Day23_Q1 {
    public static int feb(int num){
        if(num<=1){
            return num;
        }
        else{
           
            return feb(num-1)+feb(num-2);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number of terms to be printed : ");
       int num = sc.nextInt();
       for(int i=0; i<=num; i++){
        System.out.printf("%d\t",feb(i));
       }
       sc.close();
       
    }
}
