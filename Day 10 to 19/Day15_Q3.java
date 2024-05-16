import java.util.Scanner;

public class Day15_Q3 {
    public static void isPalindrome(String s, int Size){
        String reverseString="";
        for(int i=Size-1; i>=0; i--){
            char ch = s.charAt(i);
            reverseString+=ch;
        }
       
        if(s.equals(reverseString)){
            System.out.println("The string is a palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");
        String word = sc.nextLine();
        isPalindrome(word, word.length());
        sc.close();

    }

}

