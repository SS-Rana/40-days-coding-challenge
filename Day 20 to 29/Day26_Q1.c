#include<stdio.h>
#define pi 3.14
int areaOfCircle(int *radius){
    int area = pi* (*radius)*(*radius);
    return area;
}
int main(){
    int r;
    printf("Enter the radius of the circle : ");
    scanf("%d",&r);
    printf("The area of the circle is %d",areaOfCircle(&r));
    return 0;
}