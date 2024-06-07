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
    printf("\n");
}
int linearSearch(int *ptr, int value, int size){
  
   for(int i=0; i<size; i++){
    if(*ptr==value){
       return i;
        break;
    }
    ptr++;
   }
   return -1;
}
int main(){
    int size;
    printf("Enter the size of the array here: ");
    scanf("%d",&size);
    int array[size];
    int target;
    storeArray(array,size);
    printArray(array,size);
    printf("Enter the value of your target: ");
    scanf("%d",&target);
    int result = linearSearch(array, target, size);
    if(result>0){
        printf("The entered number is found inside the array at index %d",result+1);
    }
    
    return 0;
}