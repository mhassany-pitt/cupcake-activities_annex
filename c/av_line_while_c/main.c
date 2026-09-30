/*  Example: Average line length
    Author: Peter Brusilovsky
*/

#include <stdio.h>

void main () {
    int c, nl;
    long nc;

    nl = 0; nc = 0;
    while((c = getchar()) != EOF) {
        if(c == '
')
            ++nl;
        ++nc;
    }
    if(nl)
    printf("Average line length is %.2f
", nc / (float) nl);
}