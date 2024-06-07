#include<stdio.h>

void printRoman(int num){
    int arr[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    char *symbol[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    printf("The %d number in roman form is : ", num);
    for (int i = 0; num > 0; i++) {
        while (num >= arr[i]) {
            printf("%s", symbol[i]);
            num -= arr[i];
        }
    }
    printf("\n");
}

int main(){
    int num;
    printf("Enter your number : ");
    scanf("%d", &num);
    if(num<=1000){
    printRoman(num);
    }
    else{
        printf("The number is out of range please enter a number form 1-1000");
    }
    return 0;
}
