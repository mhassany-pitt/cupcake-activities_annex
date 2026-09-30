/* Example Countdown 1
   Author: Peter Brusilovsky
   Objective: practicing simple while loop with countdown control */

#include <stdio.h>

void main() {
    int counter = 5; /* setting the counter */

    printf("Start counting...
");
    while (counter) {

        printf("%d
" , counter);

        counter = counter - 1;
    }
    printf("Fire!
");
}