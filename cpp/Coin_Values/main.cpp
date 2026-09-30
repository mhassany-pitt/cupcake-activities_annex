#include <stdio.h>
int main(void)
{
     char first, middle, last;
     int pennies, nickels;  
     int dimes, quarters;   
     int change; 	
     int dollars;   
     int total_cents; 
     printf("Type in 3 initials and press return> "); 
     scanf("%c%c%c", &first, &middle, &last);
     printf("Hello %c%c%c, let's see what your coins are worth.\n",
            first, middle, last);
     printf("Number of quarters> "); 
     scanf("%d", &quarters); 
     printf("Number of dimes   > "); 
     scanf("%d", &dimes); 
     printf("Number of nickels > "); 
     scanf("%d", &nickels); 
     printf("Number of pennies > "); 
     scanf("%d", &pennies); 
     total_cents = 25 * quarters + 10 * dimes + 5 * nickels + pennies;
     dollars = total_cents / 100; 
     change = total_cents % 100; 
     printf("\nYour coins are worth %d dollars and %d cents.\n",
            dollars, change);
     return (0);
}