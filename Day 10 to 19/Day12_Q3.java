public class Day12_Q3 {
     public static void main(String[] args) {
          
            int arr1[][] = {{12,23,45},{48,98,65},{78,91,38}};
            int arr2[][] = {{85,19,67},{67,37,86},{45,61,68}};

           
            System.err.println("\nThe matrix one");
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr1.length; j++){
                    System.out.print(arr1[i][j]+" ");
                }
                System.err.println();
            }
            System.err.println("\nThe matrix two");
            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr2.length; j++){
                    System.out.print(arr2[i][j]+" ");
                }
                System.err.println();
            }
            System.err.println("\nThe Sum of the  matrix ");
            for(int i=0; i<arr2.length; i++){
                for(int j=0; j<arr2.length; j++){
                    System.out.print(arr2[i][j]+arr2[i][j]+" ");
                }
                System.err.println();
            }
}
}
