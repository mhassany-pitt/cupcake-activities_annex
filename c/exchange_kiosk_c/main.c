/*    Example: Exchange kiosk
    Course: IS 0012
    Author: Peter Brusilovsky

    This program calculates the amount of dollars
    received in an exchange kiosk for the given
    amount in German marks
*/

#include <stdio.h>

void main()
{
    float dollars_for_mark; /* exchange rate */
    int commission; /* comission in dollars */
    float marks; /* marks given */
    float dollars; /* dollars returned */

    /* get data */
    dollars_for_mark = 0.666;
    commission = 3;
    marks = 100;

    /* calculate USD */
    dollars = marks * dollars_for_mark - commission;

    /* print results */
    printf("For %6.2f marks you will get %6.2f dollars!
",
        marks, dollars);
}