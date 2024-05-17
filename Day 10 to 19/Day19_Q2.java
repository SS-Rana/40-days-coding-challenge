import java.util.ArrayList;
import java.util.List;

public class Day19_Q2 {

    public static boolean isPrime(int n) {
      boolean result = true;
      if(n<=1){
        result = false;
      }
      else if(n<=3){
        result = true;
      }
      else{
      for(int i=2; i<n/2; i++){
        if(n%i == 0){
            result = false;
            break;
        }
      }
    }
    return result;
    }

    public static List<Integer> extractPrimes(int[] arr) {
        List<Integer> primes = new ArrayList<>();
        for (int num : arr) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }
        return primes;
    }

    
    public static void main(String[] args) {
        int[] originalArray = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        List<Integer> primeArray = extractPrimes(originalArray);

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Prime numbers array:");
        for (int num : primeArray) {
            System.out.print(num + " ");
        }
    }
}
