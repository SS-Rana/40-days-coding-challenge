#include<stdio.h>
#include<stdlib.h>
#include<limits.h>
int main(){
    int *ptr, size, max=INT_MIN;
    printf("Enter the size of array: ");
    scanf("%d",&size);
    ptr = (int*) malloc (size*sizeof(int));

    for(int i=0; i<size; i++){
        printf("Enter the %d element : ",i+1);
        scanf("%d",&ptr[i]);
    }

    printf("The array : \n");
    for(int i=0; i<size; i++){
        printf("%d\t",ptr[i]);
    }

    printf("\n");
    for(int i=0; i<size; i++){
        if(max<ptr[i]){
            max=ptr[i];
        }
    }
    printf("The largest number in the array is %d ",max);
    
    return 0;
}