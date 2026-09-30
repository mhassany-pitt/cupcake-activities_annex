/*  The growth of capital over years
    Author: Peter Brusilovsky
    Primary objective: Practicing while loop with countdown control
    Secondary objective: Practicing data input and compound assignment
 */

#include <stdio.h>

void main() {
    int years; /* years the capital stays in bank */
    float interest_rate; /* interest rate in percents */
    float capital; /* capital in dollars */

    printf("Startup capital ($$$.cc): ");
    scanf("%f", &capital);
    printf("Interest rate in percents (xx.xx): ");
    scanf("%f", &interest_rate);
    printf("How many years? ");
    scanf("%d", &years);

    while (years) {
        capital += capital * interest_rate / 100;
        --years;
    }
    printf("New capital %9.2f
", capital);
}