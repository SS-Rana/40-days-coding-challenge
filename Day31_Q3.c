#include <stdio.h>

int main() {
    FILE *ptr;

   
    ptr = fopen("example.txt", "a");
    if (ptr == NULL) {
        printf("Error opening file\n");
        return 1;
    }

  
    fprintf(ptr, "Appending new content.\n");
    fprintf(ptr, "Adding more lines to the file.\n");

    
    fclose(ptr);

    printf("Content appended to file.\n");
    return 0;
}