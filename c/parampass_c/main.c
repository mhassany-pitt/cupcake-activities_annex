/*     Example: Demo of parameter passing
    Author: Peter Brusilovsky
*/

#include <stdio.h>

int testfunction(int[], int , int );

void main() {
    int testarray[] = {1, 2, 3, 4, 5, 6, 7};
    int i, testscalar = 1;

    /* printing the starting values of actual parameters */
    printf("Outside testfunction: Scalar = %d, Array = ", testscalar);
    for(i=0; i < 7; ++i)
        printf("%d ", testarray[i]);
    printf("
");

    /* calling testfunction */
    testfunction(testarray, 7, testscalar);

    /* printing the values  of actual parameters  after call */
    printf("After call: Scalar = %d, Array = ", testscalar);
    for(i=0; i < 7; ++i)
        printf("%d ", testarray[i]);
    printf("
");
}

int testfunction(int arr[], int dim, int scal) {
    int i;
    /* printing the values of formal parameters */
    printf("Inside testfunction: Scalar = %d, Array = ", scal);
    for(i=0; i < dim; ++i)
        printf("%d ", arr[i]);
    printf("
");

    /* modifying formal parameters */
    for(i=0; i < dim; ++i)
        arr[i] = 99;
    scal = 99;
    return 1;
}