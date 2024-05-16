import java.util.Scanner;

public class Day13_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.print("Enter your string here \n");
        String S = sc.nextLine();

        System.err.println("The length of the entered string is "+S.length());
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch!=' ' && ch!='\n' && ch!='\n'){
                count++;
            }
            
        }
        System.err.println("The length of the strings if spaces, tab spaces and newline "+count);
        sc.close();
    }
}
