/*  Example 14.1:  Using pointers
      Source: K&R2, p95-96
      Modified by Peter Brusilovsky
      Objective: use of addresses in function arguments
 */
#include <stdio.h>
void bad_swap(int x, int y);
void good_swap(int *p1, int *p2);
main() {
          int a = 1, b = 999;

          printf("a = %d, b = %d
", a, b);
          bad_swap(a, b);
          printf("a = %d, b = %d
", a, b);
          good_swap(&a, &b)
          printf("a = %d, b = %d
", a, b)
}
/* bad example of swapping - a function can't change parameters */
void bad_swap(int x, int y) {
          int temp;
          temp = x;
          x = y;
          y = temp;
}
/*    good example of swapping - a function can't change prameters
         but if a parameter is a pointer it can change the value it points to */
void good_swap(int *px, int *py) {
          int temp;
          temp = *px;
          *px = *py;
          *py = temp;
}