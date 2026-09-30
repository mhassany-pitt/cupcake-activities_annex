#include <stdio.h>

void main()
{
     int count, half_count;

     count = 44;
     half_count = count / 2;
     printf("count = %d; half_count = %d
" , count, half_count);
     count = 99;
     printf("count = %d; half_count = %d
" , count, half_count);
     half_count = count / 2;
     printf("count = %d; half_count = %d
" , count, half_count);
     count = count + 1;
     printf("count = %d; half_count = %d
" , count, half_count);
}