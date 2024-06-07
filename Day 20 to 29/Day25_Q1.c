#include<stdio.h>
int main(){
    int num=21;
    int *ptr;
    ptr=&num;
    printf("The value of num is %d\n",num);
    printf("The value of num is %d\n",*ptr);
    printf("The adress of num is %u\n",&num);
    printf("The adress of num is %u\n",ptr);
    printf("The value  of ptr is %d\n",ptr);
    printf("The adress of ptr is %u",&ptr);
    return 0;
}