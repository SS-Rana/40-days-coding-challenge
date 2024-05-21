import java.util.Scanner;

public class Day23_Q2 {
    public static boolean isPalindrome(String s){
        if(s.length()<=1){
            return true;
        }
        else if(s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        
        return isPalindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter your string : ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.err.println("The entered string is a palindrome");
        }
        else{
            System.out.println("The entered string is not a palindrome");
        }
        sc.close();
    }
}
