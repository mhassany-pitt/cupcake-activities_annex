#include <stdio.h>
main()
{
float revenue, cost;
revenue = 0;
cost = 0;
/* profit = revenue - cost */
printf("\nEnter total revenue: ");
scanf("%f", &revenue);
printf("\nEnter total cost: ");
scanf("%f", &cost);
printf("\nYour profit is $%.2f\n", revenue - cost);
}