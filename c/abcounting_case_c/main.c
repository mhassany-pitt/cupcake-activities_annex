/* Example: Counting letters A, B, C in the stream of text usig case */

#include <stdio.h>

void main() {

    int ch;
    int a = 0, b = 0, c = 0;

    /* Accumulating counters in the loop */
    while ((ch = getchar()) != EOF)
        switch (ch) {
            case 'a':
            case 'A':
                a++; break;
            case 'b':
            case 'B':
                b++; break;
            case 'c':
            case 'C':
                c++; break;
        }

    /* Printing results */
    printf("
Numbers of characters:

");
    printf("a %d; b %d; c %d; 
", a, b, c);
}