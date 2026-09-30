/*  Example Recursive Factorial
    Recursive calculation of Factorial
    Author: Peter Brusilovsky
*/
#include <stdio.h>

int factorial(int);

void main(){
    int i;

    printf("Enter an integer (non-negative): ");
    scanf("%d", &i);

    if(i >= 0)
        printf("%d! = %d
", i, factorial(i));
}

int factorial(int n) {
    if(n == 0)
        return 1;
    else
        return (n * factorial(n-1));
}