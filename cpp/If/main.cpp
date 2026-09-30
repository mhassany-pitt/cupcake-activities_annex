#include <stdio.h>

int main()
{ 
   int integerNum;

   printf( "Input an integer: " );
   scanf( "%d", &integerNum );

   if ( integerNum % 2 == 0 )
      printf( "%d is an even integer\n", integerNum );

   if ( integerNum % 2 != 0 )
      printf( "%d is an odd integer\n", integerNum );

   return 0;
}