import java.util.Scanner;

public class Day18_Q2 {
    public static int linearSearch(int arr[],int num){
      
     
        for(int i=0; i<arr.length; i++){
            if(arr[i]== num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {45,85,96,45,25,78,54,19};
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the integer you want to search for integer the array : ");
        int target = sc.nextInt();
        int result =linearSearch(arr,target);
        
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
        sc.close();
    }
}
