/*  Example: Average line length
    Author: Peter Brusilovsky
 */

#include <stdio.h>

void main () {
    int c, nl;
    long nc;

    nl = 0;
    for (nc = 0; (c = getchar()) != EOF; ++nc)
        if(c == '
')
            ++nl;

    if(nl)
    printf("Average line length is %.2f
", nc / (float) nl);
}