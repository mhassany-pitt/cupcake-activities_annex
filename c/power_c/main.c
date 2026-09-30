/* Example power.c: Calculating Power with functions
    Source: K&R2, p. 24-25
    Modification: Peter Brusilovsky
*/

#include <stdio.h>

int power(int, int); /* function prototype */

/* test power function */
void main() {
    int i, x, y;

    for(i = 0; i < 8; ++i) {
        x = power(2, i);
        y = power (-3, i);
        printf("%2d %5d %7d
", i, x, y);
    }
}

/* power: raise base to n-th power n >= 0 */
int power(int base, int n) {
    int i, p;

    p = 1;
    for(i = 0; i < n; ++i)
        p = p * base;
    return p;
}