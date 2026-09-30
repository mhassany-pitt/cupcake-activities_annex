/*  Example: Word Counting


    Source: K&R2, p.20
 */

#include <stdio.h>

#define IN 1 /* inside a word */
#define OUT 2 /* outside a word */

/* count lines, words, and characters in input */

void main () {
    int c, nl, nw, nc, state;

    state = OUT;
    nl = nw = nc = 0;
    while ((c = getchar()) != EOF) {
        ++nc;
        if (c == '
')
            ++nl;
        if (c == ' ' || c == '
' || c == '    ')
            state = OUT;
        else if (state == OUT) {
            state = IN;
            ++nw;
        }
    }
    printf("%d %d %d
", nl, nw, nc);
}