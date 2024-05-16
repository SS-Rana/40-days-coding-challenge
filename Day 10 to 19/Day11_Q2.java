public class Day11_Q2 {
    public static void main(String[] args) {
        
        int arr[]= {100,45,85,95,68,97,85,14,78,};
        int max = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        System.err.print("\nThe element of the array are : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
        System.err.println("The 2nd largest element in the Given array  is "+max2);
    }
}
