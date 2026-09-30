/*  Example: Simple Accumulator
    Author: Peter Brusilovsky
    Add numbers until 0 is entered. Prints the sum.
 */

#include <stdio.h>
void main () {
    int sum = 0, nextnumber;

    printf("Number: ");
    scanf("%d", &nextnumber); /* read first number */

    while (nextnumber != 0) {
        sum += nextnumber;
        printf("Number: ");
        scanf("%d", &nextnumber);
    }
    printf ("Sum = %d
", sum);
}