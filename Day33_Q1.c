#include<stdio.h>
#include<stdlib.h>
int main(){
    int *ptr;
    int size;
    int sum=0;
    printf("Enter the size of the array : ");
    scanf("%d",&size);

    ptr = (int*) malloc (size*sizeof(int));
  
    for(int i=0; i<size; i++){
        printf("Enter the %d value in the array: ",i+1);
        scanf("%d",&ptr[i]);
    }
    printf("The elements of the array :\n ");
    for(int i=0; i<size; i++){
       printf("%d\t",ptr[i]);
    }
     for(int i=0; i<size; i++){
       sum+=ptr[i];
    }
    printf("\nthe sum of the elements in the array is %d",sum);
    free(ptr);
    return 0;
}