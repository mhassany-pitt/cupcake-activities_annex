/* Example Factorial
   Peter Brusilovsky 2/10/04
   Primary objective: practicing simple while loop with countdown control
   Secondary objective: printing values of iterative functions
*/

#include <stdio.h>

void main()
{
    int counter; /* loop counter */
    int n = 1; /* this number will run from 1 to n in the loop */
    long old_factorial = 1; /* the previous value of factorial for n-1 */
    long new_factorial; /* the value of factorial(n) to be calculated */

    printf("Factorial Calculator

");
    printf("Enter positive integer: ");
    scanf("%d", &counter);

    while (counter--) {
        new_factorial = old_factorial * n;
        printf("Factorial(%d) = %ld
" , n, new_factorial);
        n++;
        old_factorial = new_factorial;
    }
}