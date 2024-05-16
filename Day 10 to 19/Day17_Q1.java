public class Day17_Q1 {
   public static int[] selectionSorting(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
           int minIndex= i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex]=temp;
        }
        return arr;
    }
    public static void printArray (int arr[]){
        System.out.printf("The sorted array : ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={45,85,95,63,15,24,-45,78,78};
        selectionSorting(arr);
        printArray(arr);
    }
}
