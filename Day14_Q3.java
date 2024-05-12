import java.util.Scanner;

public class Day14_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int[] frequency = new int[256];
        for (int i = 0; i < input.length(); i++) {
            frequency[(int) input.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                System.out.println("The frequency of '" + (char) i + "' character is " + frequency[i]);
            }
        }
    }
}


        
      
    
