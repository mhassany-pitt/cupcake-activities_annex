/* Example: Counting non-digits in the stream of text */

#include <stdio.h>

void main() {
    int ch;
    int nondig = 0;

    /* Accumulating counters in the loop */
    while ((ch = getchar()) != EOF)
        if (! (ch >= '0' && ch <= '9'))
            nondig++;

    /* Printing results */
    printf("Numbers of non-digits is %d:
", nondig);
}