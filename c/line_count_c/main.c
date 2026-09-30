/*  Example: Line Counting
    Source: K&R2, p.19
*/

#include <stdio.h>

void main () {
    int c, nl;

    nl = 0;
    while((c = getchar()) != EOF)
        if(c == '
')
            ++nl;
    printf("%d
", nl);
}