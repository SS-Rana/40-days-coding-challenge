#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int* dynamicArray(int size){
    int *arr = (int*) malloc(size * sizeof(int));
    for(int i=0; i<size; i++){
        arr[i] = rand() % (9901) + 100;
    }
    return arr;
}
void printArray(int *arr, int size){
    printf("The array ; \n");
    for(int i=0; i<size; i++){
        printf("%d\t",arr[i]);
    }
    printf("\n");
}

int  linearSearch(int *arr, int size, int num){
    for(int i=0; i<size; i++){
        if(arr[i]==num){
            return i;
        }
    }  
    return -1;
}
int main(){
    int size;
    srand(time(NULL)); 
    printf("Enter the size of the array : ");
    scanf("%d",&size);
    int *arr = dynamicArray(size);
    printArray(arr,size);
    int num;
    printf("Enter the number you want to search : ");
    scanf("%d",&num);
    int result = linearSearch(arr, size, num);
    if(result>=0){
        printf("The entered number is present in %d index of the array ",result);
    }
    else{
        printf("The entered number is not present in the array");
    }

    
    return 0;
}