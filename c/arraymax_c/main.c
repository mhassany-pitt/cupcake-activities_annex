/*     Example: Max of array elements
    Author: Peter Brusilovsky
*/

#include <stdio.h>
#define N 7 /* size of the array */

void main(){

    /* declare an array */
    int ar[N]; /* elements from ar[0] to ar[N-1]; */
    int i, max;

    /* array input */
    for (i = 0; i < N; ++i) {
        printf("%d> ", i);
        scanf("%d", &ar[i]);
    }

    /* finding max of array elements */
    max = ar[0];
    for (i = 1; i < N; ++i)
        if (max < ar[i]) max = ar[i];

    printf("%d
", max);
}