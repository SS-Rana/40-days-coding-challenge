#include<stdio.h>
#include<string.h>
typedef struct report
{
   char name[100];
   int roll;
   int cgpa;
}report;

void store(report arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("Enter the detail of %d student\n",i+1);
        printf("Enter the name: ");
        getchar();
        fgets(arr[i].name, sizeof(arr[i].name), stdin);
        int  len = strlen(arr[i].name);
        if (len > 0 && arr[i].name[len - 1] == '\n') {
            arr[i].name[len - 1] = '\0';
        }
        printf("Enter the roll number: ");
        scanf("%d", &arr[i].roll);
        printf("Enter the CGPA : ");
        scanf("%d", &arr[i].cgpa);
        printf("\n");
     
    }
}
void printStruct(report arr[], int size){
    for(int i=0; i<size; i++){
        printf("The detail of %d student \n",i+1);
        printf("Name: ");
        puts(arr[i].name);
        printf("Roll no: %d\n",arr[i].roll);
        printf("CGPA: %d\n",arr[i].cgpa);
        printf("\n");
    }
}
int main(){
    int size;
    printf("Enter the no of people whose data is needed to be stored : ");
    scanf("%d",&size);
    printf("\n");
    report arr[size];
    store(arr,size);
    printStruct(arr,size);
    return 0;
}