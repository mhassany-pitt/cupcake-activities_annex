/* Example: array input and output
    Author: Peter Brusilovsky
*/

#include <stdio.h>
#define DIM 5 /* dimension of the array */

void main(){

/* declare an array */
    int ar[DIM]; /* elements from ar[0] to ar[DIM-1]; */
    int i;

    /* array input */
    i = 0;
    while(i < DIM) {
        printf("Element %d: ", i);
        scanf("%d", &ar[i]);
        ++i;
    }
    /* array output */
    printf("This is what you have entered:
");
    i = 0;
    while(i < DIM) {
        printf("%d ", ar[i]);
        ++i;
    }
    printf("
");
}