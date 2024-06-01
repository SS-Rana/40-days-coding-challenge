#include<stdio.h>
#include<stdlib.h>

int main(){
    int *ptr;
    int size1;
    int size2;
    printf("Enter the size of the array : ");
    scanf("%d",&size1);
    ptr=(int*)calloc(size1,sizeof(int));
    for(int i=0; i<size1; i++){
        printf("Enter the %d element in the array: ",i+1);
        scanf("%d",&ptr[i]);
    }
    printf("The array : \n");
    for(int i=0; i<size1; i++){
       printf("%d\t",ptr[i]);
    }
    printf("\n");
    printf("Enter the updated size of the array : ");
    scanf("%d",&size2);
    ptr=(int*) realloc (ptr,size2*sizeof(int));
    for(int i=size1; i<size2; i++){
        printf("Enter the %d element in the array: ",i+1);
        scanf("%d",&ptr[i]);
    }
    printf("The updated array : \n");
    for(int i=0; i<size2; i++){
       printf("%d \t",ptr[i]);
    }
    free(ptr);
    return 0;
}