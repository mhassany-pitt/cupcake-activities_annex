#include <stdio.h>
int main()
{
   int grade;
   int aCounter = 0, bCounter = 0, cCounter = 0, 
       dCounter = 0, fCounter = 0;

   printf(  "Enter the letter grades.\n"  );
   printf(  "Enter the EOF character to end input.\n"  );

   while ( ( grade = getchar() ) != EOF ) {
      switch ( grade ) {    
         case 'A': case 'a':  
            ++aCounter;       
            break;
         case 'B': case 'b':  
            ++bCounter;       
            break;
         case 'C': case 'c':  
            ++cCounter;       
            break;
         case 'D': case 'd':  
            ++dCounter;       
            break;
         case 'F': case 'f':  
            ++fCounter;       
            break;
         case '\n': case' ':  
            break;
         default:     
            printf( "Incorrect letter grade entered." ); 
            printf( " Enter a new grade.\n" ); 
            break;
      }
   }
   printf( "\nTotals for each letter grade are:\n" );
   printf( "A: %d\n", aCounter );
   printf( "B: %d\n", bCounter );
   printf( "C: %d\n", cCounter );
   printf( "D: %d\n", dCounter );
   printf( "F: %d\n", fCounter );
   return 0;
}