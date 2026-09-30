/* Example: baby weighting station
    Author: Peter Brusilovsky */

#include <stdio.h>
#define NBABIES 7 /* dimension of the array */

void main(){
    float weight[NBABIES]; /* elements from ar[0] to ar[DIM-1]; */
    int i;
    float sum = 0, max = 0, average, diff;

    /* array input */
    for (i = 0; i < NBABIES; ++i) {
        printf("Weight of baby %d: ", i);
        scanf("%f", &weight[i]);
        sum += weight[i];
        if(weight[i] > max) max = weight[i];
    }

    average = sum / NBABIES;

    /* array output */
    printf("
The max weight is %.2f.
", max);
    printf("The average weight is %.2f.

", average);
    for (i = 0; i < NBABIES; ++i) {
        diff = weight[i] - average;
        printf("Baby %d: weight %.2f ", i, weight[i]);
        if(diff >= 0)
            printf("(%.2f heavier than the average)
", diff);
        else
            printf("(%.2f lighter than the average)
", -diff);
    }
}