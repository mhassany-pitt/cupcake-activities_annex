/*  Example 8.4 Digit Counting
    Source: K&R2, p.22
 */

#include <stdio.h>

/* count digits, white space, others */

main () {
    int c, i, nwhite, nother;
    int ndigit[10];

    /* initialize */
    nwhite = nother = 0;
    for(i = 0; i < 10; ++i) ndigit[i] = 0;

    /* count */
    while ((c = getchar()) != EOF)
        if (c >= '0' && c <= '9')
            ++ndigit[c - '0'];
        else if (c == ' ' || c == '
' || c == '    ')
            ++nwhite;
        else
            ++nother;

    /* report */
    printf("digits =");
    for(i = 0; i < 10; ++i)
        printf(" %d", ndigit[i]);
    printf(", white space = %d, other = %d
", nwhite, nother);
}