/*  Example max3 - maximum of three values
    Goal: demonstrate the use of nested if
    Author: Peter Brusilovsky
*/

#include <stdio.h>

void main() {
    int a, b, c;

    printf("Enter three integers: ");
    scanf("%d %d %d", &a, &b, &c);

    printf("Maximum of %d, %d and %d is ", a, b, c);

    if(a > b)
        if(a > c)
            printf("%d
", a);
        else
            printf("%d
", c);
    else
        if(b > c)
            printf("%d
", b);
        else
            printf("%d
", c);
}