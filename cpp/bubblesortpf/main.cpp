#include <stdio.h>
#define SIZE 5
void bubbleSort( int *, const int );
int main()
{
   int a[ SIZE ] = {6, 2, 10, 12, 8 };
   int i;
   printf( "Data items in original order\n" );
   for ( i = 0; i < SIZE; i++ )
      printf( "%4d", a[ i ] );
   bubbleSort( a, SIZE );          /* sort the array */
   printf( "\nData items in ascending order\n" );
   for ( i = 0; i < SIZE; i++ )
      printf( "%4d", a[ i ] );   
   printf( "\n" );
   return 0;
}
void bubbleSort( int *array, const int size )
{
   void swap( int *, int * );
   int pass, j; 
   for ( pass = 0; pass < size - 1; pass++ )
      for ( j = 0; j < size - 1; j++ )
         if ( array[ j ] > array[ j + 1 ] )
            swap( &array[ j ], &array[ j + 1 ] );
}
void swap( int *element1Ptr, int *element2Ptr )
{
   int hold = *element1Ptr;
   *element1Ptr = *element2Ptr;
   *element2Ptr = hold;
}
}