#include <stdio.h>
int main()
{
   int num = 25;
   printf( "%d\n",  num );
   printf( "%d\n",  num++ );    /* postincrement */
   printf( "%d\n\n",num );
   
   num = 25;
   printf( "%d\n", num );
   printf( "%d\n", ++num );    /* preincrement */
   printf( "%d\n", num );

   return 0;  
} 