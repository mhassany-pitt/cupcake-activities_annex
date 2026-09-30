#include <stdio.h>
int main( void )
{ 
   int row, col;

   for ( row = 1; row <= 10; row++ ) { 
      for ( col = 1; col <= row; col++ )
         printf( "*" );
      printf( "\n" );
   }
   printf( "\n" );
   for ( row = 10; row >= 1; row-- ) { 
      for ( col = 1; col <= row; col++ )
         printf( "*" );
      printf( "\n" );
   }
   return 0;
}