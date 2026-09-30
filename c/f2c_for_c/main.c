/*  Example: F2C conversion table using for loop
    Source: K&R2, p.12
    Print Fahrenheit-Celsius table
       for fahr = 0, 20, ..., 300; floating point version */

#include <stdio.h>

void main () {
    float fahr, celsius;
    int lower, upper, step;

    lower = 0;   /* lower limit of temperature table */
    upper = 300; /* upper limit */
    step = 20;   /* step size */

    for (fahr = lower; fahr <= upper; fahr = fahr + step) {
        celsius = (5.0 / 9.0) * (fahr - 32.0);
        printf ("%3.0f %6.1f
", fahr, celsius);
    }
}