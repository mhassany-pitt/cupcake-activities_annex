/* Example
    Interest calculation with several rates
    Author: Peter Brusilovsky
*/

#define FIRST_THRESHOLD 2500
#define SECOND_THRESHOLD 10000

#include <stdio.h>

main() {
    float rate1, rate2, rate3, interest_rate; /* interest rates in percents */
    float capital; /* capital in dollars */
    float annual_interest; /* annual interest in dollars */

    /* read data */
    printf("Interest rates (%%xx.xx): ");
    scanf("%f %f %f", &rate1, &rate2, &rate3);
    printf("Capital ($$.cc): ");
    scanf("%f",&capital);

    /* calculate the rate */
    if (capital < FIRST_THRESHOLD)
        interest_rate = rate1;
    else if (capital < SECOND_THRESHOLD)
        interest_rate = rate2;
    else
        interest_rate = rate3;
    printf("The rate for $%.2f is %f
", capital, interest_rate);

    /* calculate capital */
    annual_interest = capital * interest_rate / 100;
    printf("Interest %6.2f; Total %9.2f
", annual_interest, capital + annual_interest);
}