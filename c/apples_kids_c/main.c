/*  Example -  Apples for kids: a demo of % operation
    Dividing m apples among n kids without a knife.
    Author: Peter Brusilovsky
*/

#include <stdio.h>
void main () {
    int kids, apples, rounds = 0;

    printf("Kids?: ");
    scanf("%d", &kids);
    printf("Apples?: ");
    scanf("%d", &apples);

    do {
        apples -= kids;
        rounds++;
        printf("%d apples left after round %d
", apples, rounds);
    } while (apples >= kids) ;
    printf ("Each kid got %d apples. %d apples left.
", rounds, apples);
}