/* Example 9.1: Summing up array elements
   Author: Peter Brusilovsky
*/
#include <stdio.h>
#define N 7 /* dimension of the array */

void main(){
    /* declare an array */
    int ar[N]; /* elements from ar[0] to ar[N-1]; */
    int i, sum;

    /* array input */
    for (i = 0; i < N; ++i) {
        printf("%d> ", i);
        scanf("%d", &ar[i]);
    }

    /* summing array elements */
    sum = 0;
    for (i = 0; i < N; ++i)
        sum += ar[i];
    printf("%d
", sum);
}