#include <stdio.h>
#include <stdlib.h>

int main()
{ 
   char stringValue[ 6 ];
   int sum = 0, i;
   
   for ( i = 1; i <= 4; i++ ) { 
      printf( "Enter an integer string: " );
      scanf( "%s", stringValue );
      sum += atoi( stringValue );
   }
   
   printf( "\nThe total of the values is %d\n", sum );

   return 0;
}
}