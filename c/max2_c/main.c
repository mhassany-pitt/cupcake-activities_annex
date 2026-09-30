/*  Example max2 - maximum of two values
    Goal: demonstrate the use of if-else
    Author: Peter Brusilovsky
 */

#include <stdio.h>

void main() {
    int a, b;

    printf("Enter two integers: ");
    scanf("%d %d", &a, &b);

    printf("Maximum of %d and %d ", a, b);
    if(a < b)
        printf("is %d
", b);
    else
        printf("is %d
", a);
}