#include <stdio.h>
#include <stdlib.h>
int main()
{ 
   double d;
   int i;
   long l;
   d = atof( "99.0" );
   printf( "%s%.3f\n%s%.3f\n",
           "The string \"99.0\" converted to double is ", d,
           "The converted value divided by 2 is ", d / 2.0 );
   i = atoi( "2593" );
   printf( "%s%d\n%s%d\n",
           "The string \"2593\" converted to int is ", i,
           "The converted value minus 593 is ", i - 593 );

   l = atol( "1000000" );
   printf( "%s%ld\n%s%ld\n",
     "The string \"1000000\" converted to long int is ", l,
     "The converted value divided by 2 is ", l / 2 );
   return 0;
}
}