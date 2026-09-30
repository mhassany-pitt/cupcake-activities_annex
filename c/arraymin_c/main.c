/* Example: finding minimal value in an array elements
   Author: Peter Brusilovsky
*/
#include <stdio.h>
#define N 7 /* dimension of the array */

main(){
    /* declare an array */
    int ar[N]; /* elements from ar[0] to ar[N-1]; */
    int i, min;

    /* array input */
    for (i = 0; i < N; ++i) {
        printf("%d> ", i);
        scanf("%d", &ar[i]);
    }

    /* finding min of array elements */
    min = ar[0];
    for (i = 1; i < N; ++i)
        if (min > ar[i]) min = ar[i];
            printf("%d
", min);
}