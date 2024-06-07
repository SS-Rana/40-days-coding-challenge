#include<stdio.h>
#include<math.h>
int main(){
    int x =0;
    printf("The value of sin(x) for value of x =0, 15, 30.....360 is : \n");
    while(x<=2*3.14){
        printf("%.6f ",  sin(x));
        x++;
    }
    return 0;
}