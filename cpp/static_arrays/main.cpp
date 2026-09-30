#include <stdio.h>
void staticArrayInit( void );
void automaticArrayInit( void );
int main()
{
   printf( "First call to each function:\n" );
   staticArrayInit();
   automaticArrayInit();
   printf( "\n\nSecond call to each function:\n" );
   staticArrayInit();
   automaticArrayInit();
   return 0;
}
void staticArrayInit( void )
{
   static int a[ 3 ];
   int i;
   printf( "\nValues on entering staticArrayInit:\n" );
   for ( i = 0; i <= 2; i++ )
      printf( "array1[%d] = %d  ", i, a[ i ] );
   printf( "\nValues on exiting staticArrayInit:\n" );
   for ( i = 0; i <= 2; i++ )
      printf( "array1[%d] = %d  ", i, a[ i ] += 5 );
}
void automaticArrayInit( void )
{
   int a[ 3 ] = { 1, 2, 3 }, i;
   printf( "\n\nValues on entering automaticArrayInit:\n" );
   for ( i = 0; i <= 2; i++ )
      printf("array1[ %d ] = %d  ", i, a[ i ] );
   printf( "\nValues on exiting automaticArrayInit:\n" );
   for ( i = 0; i <= 2; i++ )
      printf( "array1[ %d ] = %d  ", i, a[ i ] += 5 );
}