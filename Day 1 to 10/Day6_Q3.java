import java.util.Scanner;

public class Day6_Q3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.err.print("Enter your number here: ");
        int num= sc.nextInt();
        int first=0;
        int second=1;
        int next;
        System.err.print(first + " " + second + " ");
        for(int i=3; i<=num; i++){
            next=first+second;
            System.err.print(next+" ");
           first=second;
           second=next;
        }
       
        sc.close();

        }
    }
