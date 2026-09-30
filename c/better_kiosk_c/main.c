/*      Example: Better exchange kiosk
      Course: IS 0012
      Author: Peter Brusilovsky
      This program calculates the amount of dollars
      received in an exchange kiosk for the given
      amount in German marks
*/
#include <stdio.h>

void main()
{
    float dollars_for_mark = 0.55; /* exchange rate */
    int commission = 3; /* commission in dollars */
    int marks; float dollars;

    /* get data */
    printf("Marks to exchange?: ");
    scanf("%d",&marks);

    /* calculate USD */
    dollars = marks * dollars_for_mark - commission;

    /* print result */
    printf("For %d marks you will get %6.2f dollars!
" , marks, dollars);
}