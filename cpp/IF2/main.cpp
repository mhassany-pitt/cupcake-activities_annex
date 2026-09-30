#include <stdio.h>

int main( void )
{ 
   int grade;
   int aCount = 0, bCount = 0, cCount = 0;
   int dCount = 0, fCount = 0;

   printf( "Enter the letter grades." );
   printf( " Enter the EOF character to end input:\n" );

   while ( ( grade = getchar() ) != EOF ) { 
      if ( grade == 'A' || grade == 'a' )
         ++aCount;
      else if ( grade == 'B' || grade == 'b' )
         ++bCount;
      else if ( grade == 'C' || grade == 'c' )
         ++cCount;
      else if ( grade == 'D' || grade == 'd' )
         ++dCount;
      else if ( grade == 'F' || grade == 'f' )
         ++fCount;
      else if ( grade == '\n' || grade == ' ' )
         ;     /* empty body */
      else { 
         printf( "Incorrect letter grade entered." );
         printf( " Enter a new grade.\n" );
      }
   }

   printf( "\nTotals for each letter grade were:\n" );
   printf( "A: %d\n", aCount );
   printf( "B: %d\n", bCount );
   printf( "C: %d\n", cCount );
   printf( "D: %d\n", dCount );
   printf( "F: %d\n", fCount );

   return 0;
}