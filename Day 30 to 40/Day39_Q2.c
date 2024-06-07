#include<stdio.h>
int gcd(int a, int b){
    if(b==0){
        return a;
    }
    else{
        return gcd(b, a%b);
    }
}
int main(){
    int n,m;
    printf("Enter the two numbers : \n");
    scanf("%d %d",&n,&m);
    printf("the GCD of %d and %d is %d",n,m,gcd(n,m));
    return 0;
}