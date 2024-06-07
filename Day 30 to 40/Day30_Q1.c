#include<stdio.h>
typedef struct Vector
{
   float x,y,z;
   float sum;
   
}vector;
void storeVector(vector *ptr,int size){
    for(int i=0; i<size; i++){
        printf("Enter the x,y,z of vector %d\n",i+1);
        scanf("%f",&(ptr->x));
        scanf("%f",&(ptr->y));
        scanf("%f",&(ptr->z));
        
        ptr++;
    }
}
void printVector(vector *ptr, int size){
    for(int i=0; i<size; i++){
        printf("The vector %d is %.2fi + %.2fj + %.2fk \n",i+1,ptr->x,ptr->y,ptr->z);
        ptr++;
    }
}

vector vectorSum(vector V1,vector V2){
    vector sum;
    sum.x= V1.x + V2.x;
    sum.y= V1.y + V2.y;
    sum.z= V1.z + V2.z;
    return sum;
}
int main(){
    int size;
    printf("Enter the number of vector you want to store: ");
    scanf("%d",&size);
    vector arr[size];
    storeVector(arr,size);
    printVector(arr,size);
    vector sum = vectorSum(arr[0],arr[1]);
    printf("The sum of the first two vectors is: %.2fi + %.2fj + %.2fk\n", sum.x, sum.y, sum.z);
    
    return 0;
}