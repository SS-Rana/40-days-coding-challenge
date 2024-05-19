import java.util.Scanner;

public class Day14_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st string here \n");
        String S1 = sc.nextLine();
        System.out.print("Enter your 2nd string here \n");

        String S2 = sc.nextLine();
        char S3[]= new char[S1.length()+1+S2.length()];
        sc.close();

        int i , j;
        for(i=0; i<S1.length(); i++){
            S3[i] = S1.charAt(i);
        }
        S3[i]=' ';
        i++;
        for(j=0; j<S2.length(); j++){
            S3[i] = S2.charAt(j);
            i++;
        }
        String S4 = new String(S3);
        System.err.println("The concatenated String is ");
        System.err.println(S4);

       
    }
}
