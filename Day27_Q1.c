#include<stdio.h>
void swap(int *num1, int *num2){
    int temp;
    temp=*num1;
    *num1=*num2;
    *num2=temp;
   
}
void storeArray(int *ptr, int size){
    for(int i=0; i<size; i++){
        printf("the %d element of array is ",i+1);
        scanf("%d",ptr);
        ptr++;
    }
}
void printArray(int *ptr, int size){
    printf("The array : ");
    for(int i=0; i<size; i++){
       printf("%d  ",*ptr);
        ptr++;
    }
    printf("\n");
}
void bubbleSort(int *ptr, int n){
    for(int i=0; i<n-1; i++){
        for(int j=0; j<n-i-1; j++){
            if(*(ptr+j) > *(ptr+j+1)){
                swap((ptr+j), (ptr+j+1));
            }
        }
    }
}
int main(){
     int size;
    printf("Enter the size of the array ");
    scanf("%d",&size);
    int arr[size];
    storeArray(arr,size);
    printArray(arr,size);
    bubbleSort(arr,size);
    printArray(arr,size);
    return 0;
}