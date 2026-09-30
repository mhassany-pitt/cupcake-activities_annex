/* Example Countdown 2 (improved Countdown 1)
   Peter Brusilovsky 9/12/00
   Primary objective: practicing simple while loop with countdown control
   Secondary objective: using #define
*/

#include <stdio.h>
#define HOW_MANY 5

void main()
{
    int counter = HOW_MANY; /* setting the counter */

    printf("Start counting...
");

    while (counter)
        printf("%d
" , counter--);

    printf("Fire!
");
}