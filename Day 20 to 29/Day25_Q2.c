#include<stdio.h>
int swap(int *num1, int *num2){
    int temp;
    temp=*num1;
    *num1=*num2;
    *num2=temp;
    return *num1, *num2;
}
int main(){
    int a=9,b=1;
    printf("The value of a and b before swap is %d and %d\n",a,b);
    swap(&a,&b);
    printf("The value of a and b before swap is %d and %d\n",a,b);

    return 0;
}