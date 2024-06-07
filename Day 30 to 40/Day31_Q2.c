#include <stdio.h>

int main() {
    FILE *ptr;

    
    ptr = fopen("example.txt", "w");
    if (ptr == NULL) {
        printf("Error opening file\n");
        return 1;
    }

    
    fprintf(ptr, "This is the initial content.\n");
    fprintf(ptr, "Writing some more lines.\n");

    fclose(ptr);

    printf("Content written to file.\n");
    return 0;
}