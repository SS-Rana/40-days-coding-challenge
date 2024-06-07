#include <stdio.h>

int compareStrings(char *str1, char *str2) {
    while (*str1 && (*str1 == *str2)) {
        str1++;
        str2++;
    }
    return *str1 - *str2;
}

int main() {
    char *string1 = "hello";
    char *string2 = "world";
    
    int result = compareStrings(string1, string2);
    
    if (result < 0) {
        printf("'%s' is less than '%s'\n", string1, string2);
    } else if (result > 0) {
        printf("'%s' is greater than '%s'\n", string1, string2);
    } else {
        printf("'%s' is equal to '%s'\n", string1, string2);
    }

    return 0;
}
