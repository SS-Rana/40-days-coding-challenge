#include<stdio.h>
typedef struct complexNUM
{
    float real;
    float img;
}complex;

int main(){
    complex n1 = {45.36,89.45};
    complex n2 = {28.59, 56.98};
    complex sum = {n1.real+n2.real, n1.img+n2.img};


    printf("The sum the two complex number %.2f + %.2fi and %.2f + %.2fi : \n", n1.real,n1.img, n2.real,n2.img);
    printf("%.2f + %.2fi",sum.real, sum.img);

    return 0;
}