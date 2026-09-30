/*     Example insummax.c: Input, sum and max as functions
    Author: Peter Brusilovsky
*/

#include <stdio.h>
#define N 7 /* dimension of the array */
int readarray(int ar[], int n);
int sumarray(int ar[], int n);
int maxelement(int ar[], int n);

void main() {

    /* declare an array */
    int testarray[N]; /* elements from ar[0] to ar[N-1]; */
    readarray(testarray, N);
    printf("Sum = %d, max = %d
", sumarray(testarray, N), testarray[maxelement(testarray, N)]);
}

/* array input */
int readarray(int ar[], int n_of_elements) {
    int i;
    for (i = 0; i < n_of_elements; ++i) {
        printf("%d> ", i);
        scanf("%d", &ar[i]);
    }
    return 0;
}

/* summing array elements */
int sumarray(int ar[], int n_of_elements) {
    int i, sum = 0;
    for (i = 0; i < n_of_elements; ++i)
        sum += ar[i];
    return sum;
}

/* finding index of max array element */
int maxelement(int ar[], int n) {
    int i, maxind = 0;
    for (i = 1; i < n; ++i)
        if (ar[maxind] < ar[i]) maxind = i;
    return maxind;
}