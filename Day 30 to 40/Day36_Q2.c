#include <stdio.h>
#include <limits.h>


int maxArray(int m, int n , int arr[m][n]) {
    int max = INT_MIN;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (max < arr[i][j]) {
                max = arr[i][j];
            }
        }
    }
    return max;
}

int main() {
    int m = 3, n = 3;
    int arr[3][3] = {
        {78, 98, 69},
        {48, 96, 31},
        {48, 79, 36}
    };
    printf("The max number in the array is %d ", maxArray(m, n, arr));
    return 0;
}
