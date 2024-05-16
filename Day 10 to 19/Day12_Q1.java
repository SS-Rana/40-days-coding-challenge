public class Day12_Q1 {
    public static void main(String[] args) {
        
        int arr[] = {2, 3, 2, 3,  2, 3, 4, 6, 5, 5, 4, 6};
        int frequency[] = new int[arr.length]; 

        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i] ]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("The frequency of " + (i) + " in the given array is " + frequency[i]);
            }
        }
    }
}
