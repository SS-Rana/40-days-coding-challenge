
public class Day19_Q2 {

     public static void arrayprint(int arr[], int size){
      for(int i=0;i<size;i++){
          System.out.printf("%d \t",arr[i]);
      }
  }
  
  public static int isPrime(int num) {
      if (num <= 1) {
          return 0;
      }
      for (int i = 2; i * i <= num; i++) {
          if (num % i == 0) {
              return 0;
          }
      }
      return 1;
  }
  
  public static void arraycopy(int arr[]){
      int n=arr.length;
      int count=0;
      int[] arr2=new int[arr.length];
      for(int i=0;i<n;i++){
          int check=isPrime(arr[i]);
          if(check==1){
              arr2[count]=arr[i];
              count++;
          }
      }
      arrayprint(arr2, count);
  }
  
  public static void main(String[] args) {
      int[] array={1,7,89,13,4,6};
      arraycopy(array);
  }
  
}
