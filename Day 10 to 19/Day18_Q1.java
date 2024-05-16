public class Day18_Q1 {
    public static int [] insertionSorting(int  arr[]){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1]=key;
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
        int arr[]={45,85,95,46,75,545};
        insertionSorting(arr);
        printArray(arr);
    }
}
