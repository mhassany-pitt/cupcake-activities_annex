/* Example: Counting letters A, B, C in the stream of text */

#include <stdio.h>

void main() {

    int ch;
    int a = 0, b = 0, c = 0;

    /* Accumulating counters in the loop */
    while ((ch = getchar()) != EOF)
        if (ch == 'a' || ch == 'A')
            a++;
        else if (ch == 'b' || ch == 'B')
            b++;
        else if (ch == 'c' || ch == 'C')
            c++;

    /* Printing results */
    printf("
Numbers of characters:

");
    printf("a %d; b %d; c %d; 
", a, b, c);
}