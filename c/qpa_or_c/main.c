/* Example qpa_or.c
    Admission to BSIS program
    Goal: The use of else-if and or operator (II)
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

    /* make the decision using or operator (II) connecting two conditions */
    if (qpa1 < MINQPA || qpa2 < MINISQPA)
        printf("Your QPA is too low for BSIS
");
    else
        printf("You are admitted to BSIS program!
");
}