#include<stdio.h>
#include<string.h>
typedef struct car
{
   char name[100];
   int Id;
   int rent;
}car;


void printStruct(car arr[], int size){
    for(int i=0; i<size; i++){
        printf("The detail of %d Car \n",i+1);
        printf("Name: ");
        puts(arr[i].name);
        printf("Id no: %d\n",arr[i].Id);
        printf("Rent for a day: %d\n",arr[i].rent);
        printf("Rent for 15 days: %d\n",arr[i].rent*15);
        printf("\n");
    }
}
int main(){
    car arr[5]={
        {"Toyota Camry", 1, 50},
        {"Honda ", 2, 45},
        {"Ford Fusion", 3, 55},
        {"Chevrolet ", 4, 60},
        {"Nissan ", 5, 48}
    };
     int size = sizeof(arr) / sizeof(arr[0]);
    printStruct(arr,size);
    return 0;
    return 0;
}