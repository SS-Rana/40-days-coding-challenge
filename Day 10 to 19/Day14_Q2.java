import java.util.Scanner;

public class Day14_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originalString = "Hello World";
        System.err.println("Enter the index form were you want to delete the character : ");
        int indexToDelete = sc.nextInt(); 

        
        String newString = originalString.substring(0, indexToDelete-1) + originalString.substring(indexToDelete);

        System.out.println("Original string: " + originalString);
        System.out.println("New string after deleting character at index " + indexToDelete + ": " + newString);
        sc.close();
    }
}
