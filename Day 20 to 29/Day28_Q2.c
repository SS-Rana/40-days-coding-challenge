#include<stdio.h>
void printArray(int *ptr, int size){
    printf("The array : ");
    for(int i=0; i<size; i++){
       printf("%d  ",*ptr);
        ptr++;
    }
    printf("\n");
}
void selectionSort (int *arr,int size){
    for(int i=0; i<size-1; i++){
        int minIndex=i;
        int temp;
        for(int j=i+1; j<size; j++){
            if(*(arr+j) < *(arr+minIndex)){
                minIndex=j;
            }
        }
        if(minIndex!=i){
            temp= *(arr+i);
            *(arr+i)=*(arr+minIndex);
            *(arr+minIndex)=temp;
        }
    }
}
int main(){
    int array[]={45,16,35,75,91,84,36,47,36};
    int size= sizeof(array)/sizeof(array[0]);
    printArray(array,size);
    selectionSort(array,size);
    printf("After sorting ");
    printArray(array,size);
    return 0;
}