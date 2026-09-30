#include <stdio.h>
#include <string.h>
#include <ctype.h>
int main()
{ 
   char text[ 3 ][ 80 ], search[ 20 ], *searchPtr;
   int count = 0, i, j;
   printf( "Enter three lines of text:\n" );
 
   for ( i = 0; i <= 2; i++ )
      gets( &text[ i ][ 0 ] );

   /* make all characters lowercase */
   for ( i = 0; i <= 2; i++ )    
      for ( j = 0; text[ i ][ j ] != '\0'; j++ ) 
         text[ i ][ j ] = tolower( text[ i ][ j ] );

   printf( "\nEnter a search string: " );
   scanf( "%s", search );

   for ( i = 0; i <= 2; i++ ) { 
      searchPtr = &text[ i ][ 0 ];
      
      while ( searchPtr = strstr( searchPtr, search ) ) { 
         ++count; 
         searchPtr++;
      }
   }
   printf( "\nThe total occurrences of \"%s\" in the text is %d\n",
          search, count );
   return 0;
}
}