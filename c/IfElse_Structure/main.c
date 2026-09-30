#include <stdio.h>

int main()
{
  float monthlySales, income;

  printf("Enter the value of monthly sales: ");
  scanf("%f", &monthlySales);

  if (monthlySales >= 50000.00f)
    income = 575.00f + .16f * monthlySales;
  else if (monthlySales >= 40000.00f)
    income = 550.00f + .14f * monthlySales;
  else if (monthlySales >= 30000.00f)
    income = 525.00f + .12f * monthlySales;
  else if (monthlySales >= 20000.00f)
    income = 500.00f + .09f * monthlySales;
  else if (monthlySales >= 10000.00f)
    income = 450.00f + .05f * monthlySales;
  else
    income = 400.00f + .03f * monthlySales;

  printf("The income is $%7.2f\n",income);

  return 0;
}