#include <stdio.h>
#include <string.h>

int main()
{ 
   int i, length;
   char array[ 5 ][ 20 ];
      
   for ( i = 0; i <= 4; i++ ) { 
      printf( "Enter a string: " );
      scanf( "%s", &array[ i ][ 0 ] );
   }
   
   printf( "\nThe strings ending with \"NG\" are:\n" );
   
   for ( i = 0; i <= 4; i++ ) { 
      length = strlen( &array[ i ][ 0 ] );
      
      if ( strcmp( &array[ i ][ length - 2 ], "NG" ) == 0 )
         printf( "%s\n", &array[ i ][ 0 ] );
   }

   return 0;
}
}