/*  Example max1 - maximum of two values
    Goal: demonstrate the use of if
    Author: Peter Brusilovsky
 */

#include <stdio.h>

void main() {
    int a, b, max;

    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);

    max = a;

    if(a < b)
        max = b;

    printf("Maximum of %d and %d is %d", a, b, max);
}