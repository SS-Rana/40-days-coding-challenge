#include<stdio.h>
#include<string.h>
void toUpperCase(char *ch){
    if(*ch>='a' && *ch<='z'){
        *ch= (*ch) - ('a'-'A');
    }
}
void toLowerCase(char *ch){
    if(*ch >= 'A' && *ch <= 'Z'){
        *ch = (*ch) + ('a' - 'A'); 
    }
}
void strToUpperCase(char *ptr){
    while(*ptr!='\0'){
    toUpperCase(ptr);
    ptr++;
    }
}
void strToLowerCase(char *ptr){
    while(*ptr!='\0'){
    toLowerCase(ptr);
    ptr++;
    }
}

int main(){
    char str[100];
    printf("Enter a string in lowercase: ");
    fgets(str, sizeof(str), stdin);
    int  len = strlen(str);
    if (len > 0 && str[len - 1] == '\n') {
        str[len - 1] = '\0';
    }
    printf("Entered string in Uppercase: ");
    strToUpperCase(str);
    puts(str);
    printf("Entered string in lowercase: ");
    strToLowerCase(str);
    puts(str);
    return 0;
}