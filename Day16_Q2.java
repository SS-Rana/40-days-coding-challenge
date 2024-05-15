import java.util.Scanner;

public class Day16_Q2 {
    public static int hcf(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter both the numbers here");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 =  hcf(num1, num2);

        System.err.println("The hcf of "+num1+" and "+num2+" is "+num3);
     sc.close();  
    }
}
