#include <stdio.h>
#include <string.h>

void reverseTokens( char * );

int main()
{ 
   char text[ 80 ];
   
   printf( "Enter a line of text:\n" );
   gets( text );
   reverseTokens( text );

   return 0;
}

void reverseTokens( char *sentence )
{ 
   char *pointers[ 50 ], *temp;
   int count = 0, i;
   
   temp = strtok( sentence, " " );
   
   while ( temp ) { 
      pointers[ count++ ] = temp;
      temp = strtok( NULL, " " );
   }
   
   printf( "The tokens in reverse order are:\n" );

   for ( i = count - 1; i >= 0; i-- )
      printf( "%s ", pointers[ i ] );   
}
}