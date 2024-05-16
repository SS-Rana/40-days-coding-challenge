public class Day15_Q2 {
    public static float avg(int[] array, int size) {
        int sum=0;
        float avg;
        for(int i=0; i<size; i++){
            sum+=array[i];
        }
        avg = (float)sum/size;
        return avg;
    }
    public static void main(String[] args) {
        
        int arr[] ={45,85,95,75,68,91,74,78};
        float average = avg(arr, arr.length);
        System.out.printf("The average of the given array is %.2f ",average);
        
        
    }
}
