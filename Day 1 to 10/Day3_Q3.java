import java.util.*;

public class Day3_Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        sc.close();
    }
}
