/* Example: array input and output with for loop
    Author: Peter Brusilovsky
*/

#include <stdio.h>
#define DIM 5 /* dimension of the array */

void main(){

    int ar[DIM]; /* elements from ar[0] to ar[DIM-1]; */
    int i;

    /* array input */
    for (i = 0; i < DIM; ++i) {
        printf("Element %d: ", i);
        scanf("%d", &ar[i]);
    }
    /* array output */
    printf("This is what you have entered:
");
    for (i = 0; i < DIM; ++i)
        printf("%d ", ar[i]);
    printf("
");

    /* output in reverse order */
    printf("And now in reverse order:
");
    for (i = DIM-1; i >= 0; --i)
        printf("%d ", ar[i]);
    printf("
");
}