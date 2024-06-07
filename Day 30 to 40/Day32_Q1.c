#include <stdio.h>

int main() {
    FILE *ptr1;
    FILE *ptr2;
    

    ptr1 = fopen("text1.txt", "r");
    ptr2 = fopen("text2.txt", "r");


    if (ptr1 == NULL || ptr2 == NULL) {
        printf("One of the two files does not exist\n");
        return 1;
    }

    int position = 0;
    int line = 1; 

    while (1) {
        char ch1 = fgetc(ptr1);
        char ch2 = fgetc(ptr2);

     
        if (ch1 == EOF && ch2 == EOF) {
            printf("Both files are similar\n");
            break;
        }

        if (ch1 != ch2) {
            printf("There is an error at position %d in line %d\n", position, line);
            break;
        }


        position++;
        if (ch1 == '\n' && ch2 == '\n') {
            line++;
        }
    }

  
    fclose(ptr1);
    fclose(ptr2);

    return 0;
}
