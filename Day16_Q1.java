public class Day16_Q1 {
    public static int []bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++ ){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
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
        int arr[]={24,56,98,78,31,45,45,85,91};
        bubbleSort(arr);
        printArray(arr);
        System.out.println("The second largest number in array is "+arr[arr.length-2]);

    }
}
