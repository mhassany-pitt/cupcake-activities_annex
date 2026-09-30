#include <stdio.h>
#define N 7 /* dimension of the array */
int testarray[N]; /* global array */
int sumarray(); /* function prototype */

void main() {
    int i;
    /* input */
    for (i = 0; i < N; ++i) {
        printf("%d> ", i);
        scanf("%d", &testarray[i]);
    }
    /* printing the sum of elements */
    printf("Sum of array elements = %d
", sumarray());
}

/* function for summing array elements */
int sumarray() {
    int i, sum = 0;
    for (i = 0; i < N; ++i)
        sum += testarray[i];
    return sum;
}