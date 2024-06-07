#include<stdio.h>
int factorial(int num){
    if(num<=1){
        return 1;
    }
    else{
        return num*factorial(num-1);
    }
}
void ifStrong(int num){
    int result;
    int originalNum=num;
    int sum=0;
    while(num!=0){
        result = num%10;
        num = num/10;
        sum+=factorial(result);
    }
    if(sum==originalNum){
        printf("The entered number is a Strong number");
    }
    else{
        printf("The entered number is not a Strong number");
    }
}
int main(){
    int num;
    printf("Enter your number here: ");
    scanf("%d",&num);
    ifStrong(num);
    return 0;
}