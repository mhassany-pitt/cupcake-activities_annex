#include <stdio.h>
#include <string.h>
int main()
{ 
   char text[ 4 ][ 80 ], *tokenPtr;
   int i, counter = 0;
     
   printf( "Enter 4 lines of text: \n" );
   
   for ( i = 0; i <= 3; i++ )
      gets( &text[ i ][ 0 ] );
   
   for ( i = 0; i <= 3; i++ ) { 
      tokenPtr = strtok( &text[ i ][ 0 ], " \n" );
      
      while ( tokenPtr ) { 
         ++counter;
         tokenPtr = strtok( NULL, " \n" );
      }
   }
   
   printf( "\nThe total number of words is %d\n", counter );

   return 0;
}
}