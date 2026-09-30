#include <stdio.h>
int main()
{
   int sumCount = 0, number;
   for ( number = 2; number <= 100; number += 2 )
      sumCount += number;
      
   printf( "Sum is %d\n", sumCount );
   return 0;
}