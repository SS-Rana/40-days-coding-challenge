#include<stdio.h>
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
}
int main(){
    int size;
    printf("Enter the size of the array ");
    scanf("%d",&size);
    int arr[size];
    storeArray(arr,size);
    printArray(arr,size);
    return 0;
}