/*  Example maxloop.c Running Max
    Goal: The use of if statement inside the loop
    Author: Peter Brusilovsky
    Reads numbers until -1 is entered. Prints the max number entered.
 */

#define SENTINEL -1
#include <stdio.h>

void main () {
    int max, nextnumber;

    printf("Number: ");
    scanf("%d", &nextnumber); /* read first number */
    max = nextnumber; /* pre-assignment */

    while (nextnumber != SENTINEL) {
        if (max <  nextnumber)
            max = nextnumber;
        printf("Number: ");
        scanf("%d", &nextnumber);
    }
    printf ("Max = %d
", max);
}