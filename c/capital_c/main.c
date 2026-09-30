#include <stdio.h>
main() {
    float interest_rate; /* interest rate in percents */
    int capital; /* starting capital in dollars */
    float annual_interest; /* annual interest in dollars */

    printf("Capital ($$) and interest rate (%%xx.xx): ");
    scanf("%d %f",&capital, &interest_rate);

    annual_interest = capital * interest_rate / 100;
    printf("Interest %6.2f; Total %9.2f
", annual_interest, capital + annual_interest);
}