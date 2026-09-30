#include <stdio.h>
int main()
{ 
   char c, sentence[ 80 ];
   int i = 0;
   puts( "Enter a line of text:" );
   while ( ( c = getchar() ) != '\n') 
      sentence[ i++ ] = c;
   sentence[ i ] = '\0';  /* insert null at end of string */
   puts( "\nThe line entered was:" );
   puts( sentence );
   return 0;
}
}