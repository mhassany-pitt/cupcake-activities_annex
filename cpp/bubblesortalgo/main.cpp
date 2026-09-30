/* The Bubble Sort Algorithm.*/
#define SIZE 10
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

/* function prototypes */
void bubbleSort( int array[], int length );
void printPass( int array[], int length, int pass );

int main( void )
{
   int array[ SIZE ]; /* declare the array of ints to be sorted */
   int i; /* int used in for loop */
    
   srand( time( NULL ) ); /* seed the rand function */
   
   for ( i = 0; i < SIZE; i++ )
      array[ i ] = rand() % 90 + 10; /* give each element a value */
       
   printf( "Unsorted array:\n" );
    
   for ( i = 0; i < SIZE; i++ ) /* print the array */
      printf( "%d  ", array[ i ] );
        
   printf( "\n\n" );
   bubbleSort( array, SIZE );
   printf( "Sorted array:\n" );
    
   for ( i = 0; i < SIZE; i++ ) /* print the array */
      printf( "%d  ", array[ i ] );
        
   return 0;
} /* end function main */

/* function that bubble sorts the array */
void bubbleSort( int array[], int length )
{
   int pass; /* pass counter */
   int j;    /* comparison counter */
   int hold; /* temporary location used to swap elements */ 
   /* loop to control number of passes */
   for ( pass = 1; pass < length; pass++ ) {

      /* loop to control number of comparisons per pass */
      for ( j = 0; j < length - 1; j++ ) {

         /* swap elements if out of order */
         if ( array[ j ] > array[ j + 1 ] ) {
            hold = array[ j ];
            array[ j ] = array[ j + 1 ];
            array[ j + 1 ] = hold;
         } /* end if */

      } /* end inner for */
	printPass ( array, SIZE, pass);
   } /* end outer for */

} /* end function bubbleSort */

/* function that prints a pass of the algorithm */
void printPass( int array[], int length, int pass )
{
   int j; /* counter */

   printf( "After pass %2d: ", pass );
    
   /* output array elements */
   
   /* output array contents */
   for ( j = 0; j < length; j++ ) {

      if ( j % 10 == 0 ) { /* begin new line every 10 values */
         printf( "\n" );
      } /* end if */

      printf( "%2d ", array[ j ] );
   } /* end for */
   printf( "\n" );	
} /* end function printArray */
} /* end function printArray */