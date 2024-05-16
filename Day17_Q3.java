import java.util.Scanner;

public class Day17_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter your String : ");
        String word = sc.nextLine();

        System.out.println("the reverse of the entered string is "+reverseString(word));
            sc.close();
        
    }
    public static String reverseString(String Word){
        String reverse="";
        for(int i=Word.length()-1; i>=0;i--){
            char ch= Word.charAt(i);
            reverse+=ch;
            
        }
        
        return reverse;
    }
}
