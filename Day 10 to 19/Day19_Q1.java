import java.util.Scanner;

public class Day19_Q1 {
    public static void insertionSorting(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }
    public static void printArray (int arr[]){
        System.out.printf("The array : ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
        System.out.println();
    }
    public static int binarySearch (int arr[],int low, int high, int target){
        if(low<=high){
       int mid = low +( high - low)/2;

       if(arr[mid]==target){
        return mid;
       }
       else if (arr[mid]>target){
        return binarySearch(arr, low, mid-1, target);
       }
       else{
        return binarySearch(arr, mid+1, high, target);
       }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={45,85,95,48,62,35,75,19,36,18};
        printArray(arr);
        insertionSorting(arr);
        System.err.println("After Sorting");
        printArray(arr);
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        int result = binarySearch(arr, 0, arr.length-1, target);
        if(result==-1){
            System.out.println("The target is not in the array");
        }
        else{
        System.out.printf("The target number is at index %d in the sorted array",result);
        }
        sc.close();
    }
}