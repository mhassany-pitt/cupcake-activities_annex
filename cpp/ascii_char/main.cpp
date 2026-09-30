#include <stdio.h>

int main()
{ 
   int c;
   
   printf( "Enter an ASCII character code ( EOF to end ): " );
     
   while ( scanf( "%d", &c ) != EOF ) { 
      if ( c >= 0 && c <= 255 )
         printf( "The corresponding character is '%c'\n", c );
      else
         printf( "Invalid character code\n" );
      
      printf( "\nEnter an ASCII character code ( EOF to end ): " );
   }

   return 0;
}
}