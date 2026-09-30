/* Example rate2.c
    Interest with variable rate
    Goal: The use of if-else for conditional calculations
    Author: Peter Brusilovsky
 */

#define THRESHOLD 5000

#include <stdio.h>

void main() {
    float rate1, rate2, interest_rate; /* interest rates in percents */
    float capital; /* capital in dollars */
    float annual_interest; /* annual interest in dollars */

    /* read data */
    printf("Interest rates (%%xx.xx): ");
    scanf("%f %f", &rate1, &rate2);
    printf("Capital ($$.cc): ");
    scanf("%f",&capital);

    /* calculate the rate */
    if (capital < THRESHOLD)
        interest_rate = rate1;
    else
        interest_rate = rate2;
    printf("The rate for $%.2f is %.2f%%
", capital, interest_rate);

    /* calculate capital */
    annual_interest = capital * interest_rate / 100;
    printf("Interest %6.2f; New capital %9.2f
", annual_interest, capital + annual_interest);
}