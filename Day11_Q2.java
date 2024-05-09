public class Day11_Q2 {
    public static void main(String[] args) {
        
        int arr[]= {45,85,95,68,97,85,14,78,};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
           

            if( max<arr[i]){
                max=arr[i];
            }
        }
        System.err.print("\nThe element of the array are : ");
        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println();
        System.err.println("The Smallest element in the Given array  is "+max);
    }
}
