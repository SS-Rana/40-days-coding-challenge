#include<stdio.h>
int main(){
    FILE *ptr;
    int num, num2;
    ptr = fopen("sumit.txt","r");
    fscanf(ptr,"%d",&num);
    fscanf(ptr,"%d",&num2);
    printf("The value of number is %d and %d",num,num2);

    char c = fgetc(ptr);
    while (c != EOF) {
        printf("%c", c);
        c = fgetc(ptr);
    }
    
    fclose(ptr);
    return 0;
}