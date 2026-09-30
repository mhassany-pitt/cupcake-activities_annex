#include <stdio.h>
#include <ctype.h>
void convertToLowercase( char * );
int main()
{
   char string[] = "CHARACTERS AND $32.98";
   printf( "The string before conversion is: %s", string );
   convertToLowercase( string );
   printf( "\nThe string after conversion is: %s\n", string ); 
   return 0;
}
void convertToLowercase( char *sPtr )
{
   while ( *sPtr != '\0' ) {
      if ( isupper( *sPtr ) )
         *sPtr = tolower( *sPtr );  
      ++sPtr;  
   }
}
}