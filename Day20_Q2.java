import java.util.Scanner;

public class Day20_Q2 {
    public static void decToBinary (int num) {
        int binary[]= new int [200];
        int i=0;
        while(num!=0){
            binary[i] = num%2;
            num = num/2;
            i++;
        }
        System.out.printf("The binary number is ");
        for(int j= i-1; j>=0; j--){
            System.out.printf("%d ",binary[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number here : ");
        int num = sc.nextInt();
        decToBinary(num);
        sc.close();

    }
}