/* Example qpa_and.c
    Admission to BSIS program
    Goal: The use of and operator (&&) and else-if
    Author: Peter Brusilovsky
    You are admitted only if your general and IS QPAs
    are above the specified thresholds
*/

#define MINQPA 2.5
#define MINISQPA 2.75

#include <stdio.h>

main() {
    float qpa1, qpa2;

    /* read data */
    printf("Your general QPA?: ");
    scanf("%f", &qpa1);
    printf("Your IS QPA?: ");
    scanf("%f", &qpa2);

    /* make the decision using and operator connecting two conditions */
    if (qpa1 >= MINQPA && qpa2 >= MINISQPA)
        printf("You are admitted to BSIS program!
");
    else /* here either qpa1 < MINQPA or qpa2 < MINISQPA or both */
        printf("Your QPA is too low for BSIS
");
}