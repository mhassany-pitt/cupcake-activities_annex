/* Example: Temperature Converter with input
    Author: Peter Brusilovsky
*/
#include <stdio.h>

void main()  {
    float fahr; /* the temperature to be converted */

    /* Data input */
    printf("Enter temperature in Fahrenheit: "); /* prompt */
    scanf("%f",&fahr); /* input */

    /* Calculation and printing */
    printf("%6.2f Fahrenheit = %6.2f Celsius
",
        fahr, (5.0 / 9.0) * (fahr - 32));
}