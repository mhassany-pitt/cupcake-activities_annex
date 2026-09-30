/*  Example 24.2
    Recursive calculation of Power
    Author: Peter Brusilovsky
    The program requests two integers a and b and calculates a power b
    If b is negative, the program does nothing
*/
#include <stdio.h>

int power(int, int);

void main(){
    int a, b;

    printf("Enter a and b: ");
    scanf("%d %d", &a, &b);

    if(b >= 0)
        printf("%d power %d = %d
", a, b, power(a, b));
}

int power(int base, int exp) {
    if(exp == 0)
        return 1;
    else
        return (base * power(base, exp - 1));
}
}