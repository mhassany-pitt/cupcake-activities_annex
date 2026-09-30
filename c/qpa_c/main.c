/* Example qpa.c
    Admission to BSIS program
    Goal: The use of else-if
    Author: Peter Brusilovsky
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

    /* make decision */
    if (qpa1 < MINQPA)
        printf("Your general QPA is too low for BSIS
");
    else if (qpa2 < MINISQPA)
        printf("Your Information Science QPA is too low for BSIS
");
    else /* here qpa1 >= MINQPA and qpa2 >= MINISQPA */
        printf("You are admitted to BSIS program!
");
}