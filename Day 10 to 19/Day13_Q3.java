import java.util.Scanner;

public class Day13_Q3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String originalString ="Hello World";

        String copyString = new String(originalString);

        System.err.println(copyString);
        sc.close();
    }
}
