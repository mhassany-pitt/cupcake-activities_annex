#include <stdio.h>
#include <ctype.h>

int main()
{ 
   char s[ 100 ];
   int i;
     
   printf( "Enter a line of text:\n" );
   gets( s );
   
   printf( "\nThe line in uppercase is:\n" );
   
   for ( i = 0; s[ i ] != '\0'; i++ )
      printf( "%c", toupper( s[ i ] ) );
   
   printf( "\n\nThe line in lowercase is:\n" );
   
   for ( i = 0; s[ i ] != '\0'; i++ )
      printf( "%c", tolower( s[ i ] ) );

   return 0;
}
}